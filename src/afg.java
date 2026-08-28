import java.util.Optional;

public record afg(String b, String c, int d, Optional<wp> e, Optional<yf> f) implements yw<abl> {
   public static final yn<wa, afg> a = yn.a(yl.o, afg::b, yl.o, afg::e, yl.h, afg::f, wr.e, afg::g, yh.d, afg::h, afg::new);

   @Override
   public yy<afg> a() {
      return age.aP;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wp> g() {
      return this.e;
   }

   public Optional<yf> h() {
      return this.f;
   }
}
