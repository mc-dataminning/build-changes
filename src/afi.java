import java.util.Optional;

public record afi(String b, String c, int d, Optional<wz> e, Optional<yp> f) implements zg<abu> {
   public static final yx<wk, afi> a = yx.a(yv.l, afi::b, yv.l, afi::e, yv.g, afi::f, xb.e, afi::g, yr.d, afi::h, afi::new);

   @Override
   public zi<afi> a() {
      return agg.aL;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wz> g() {
      return this.e;
   }

   public Optional<yp> h() {
      return this.f;
   }
}
