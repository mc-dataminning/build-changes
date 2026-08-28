import java.util.Optional;

public record afw(String b, String c, int d, Optional<xp> e, Optional<zf> f) implements zw<aci> {
   public static final zn<xa, afw> a = zn.a(zl.l, afw::b, zl.l, afw::e, zl.g, afw::f, xr.e, afw::g, zh.d, afw::h, afw::new);

   @Override
   public zy<afw> a() {
      return agu.aL;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xp> g() {
      return this.e;
   }

   public Optional<zf> h() {
      return this.f;
   }
}
