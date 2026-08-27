import java.util.Optional;

public record adz(String b, String c, int d, Optional<vu> e, Optional<xk> f) implements yb<aam> {
   public static final xs<vf, adz> a = xs.a(xq.i, adz::b, xq.i, adz::e, xq.d, adz::f, vw.c, adz::g, xm.d, adz::h, adz::new);

   @Override
   public yd<adz> a() {
      return aex.aL;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<vu> g() {
      return this.e;
   }

   public Optional<xk> h() {
      return this.f;
   }
}
