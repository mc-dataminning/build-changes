import java.util.Optional;

public record aff(String b, String c, int d, Optional<wp> e, Optional<yf> f) implements yw<abl> {
   public static final yn<wa, aff> a = yn.a(yl.o, aff::b, yl.o, aff::e, yl.h, aff::f, wr.e, aff::g, yh.d, aff::h, aff::new);

   @Override
   public yy<aff> a() {
      return agd.aO;
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
