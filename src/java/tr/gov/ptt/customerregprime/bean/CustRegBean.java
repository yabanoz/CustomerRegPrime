
package tr.gov.ptt.customerregprime.bean;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import tr.gov.ptt.customerregprime.util.JSFUtil;

@ManagedBean(name = "cust")
@SessionScoped
public class CustRegBean {

    private String ad;
    private String soyad;
    private java.util.Date dogTar;
    private String sifre;
    
    private String evTel;
    private String cepTel;
    private String sokak;
    
    public CustRegBean() {
        ad="";
        soyad="";
        sifre="";
        dogTar= new java.util.Date();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getDogTar() {
        return dogTar;
    }

    public void setDogTar(Date dogTar) {
        this.dogTar = dogTar;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEvTel() {
        return evTel;
    }

    public void setEvTel(String evTel) {
        this.evTel = evTel;
    }

    public String getCepTel() {
        return cepTel;
    }

    public void setCepTel(String cepTel) {
        this.cepTel = cepTel;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }
        
    public  String kaydetcustomer()
    {
        JSFUtil.mesajEkle("Kayıt Başarılı", ad+" "+soyad+ " başarıyla kaydedildi.");
            
        return "result.xhtml?faces-redirect-true";
    }
    
    public String giris(){
        ad= "";
        soyad="";
        sifre="";
        sokak="";
        evTel="";
        cepTel="";
        return "custReg2.xhtml?faces-redirect-true";
    }
    
       
}
