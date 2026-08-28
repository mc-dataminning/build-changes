import java.util.Optional;

public record afu(String b, String c, int d, Optional<xh> e, Optional<yx> f) implements zo<acd> {
   public static final zf<ws, afu> a = zf.a(zd.m, afu::b, zd.m, afu::e, zd.h, afu::f, xj.e, afu::g, yz.d, afu::h, afu::new);

   @Override
   public zq<afu> a() {
      return ags.aM;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xh> g() {
      return this.e;
   }

   public Optional<yx> h() {
      return this.f;
   }
}
