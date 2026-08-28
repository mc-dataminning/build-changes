import java.util.Optional;

public record afm(String b, String c, int d, Optional<ww> e, Optional<ym> f) implements zd<abs> {
   public static final yu<wh, afm> a = yu.a(ys.o, afm::b, ys.o, afm::e, ys.h, afm::f, wy.e, afm::g, yo.d, afm::h, afm::new);

   @Override
   public zf<afm> a() {
      return agl.aP;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<ww> g() {
      return this.e;
   }

   public Optional<ym> h() {
      return this.f;
   }
}
