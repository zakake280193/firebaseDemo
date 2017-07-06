package ducnm.com.firebasedemo;

/**
 * Created by Administrator on 7/4/2017.
 */

public class sinhVien {
    private String hoTen;
    private String namSinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public sinhVien() {
    }

    public sinhVien(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
}
