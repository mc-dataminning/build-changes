import java.util.Optional;

public record afw(String b, String c, int d, Optional<xj> e, Optional<yz> f) implements zq<acf> {
   public static final zh<wu, afw> a = zh.a(zf.n, afw::b, zf.n, afw::e, zf.h, afw::f, xl.e, afw::g, zb.d, afw::h, afw::new);

   @Override
   public zs<afw> a() {
      return agu.aM;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xj> g() {
      return this.e;
   }

   public Optional<yz> h() {
      return this.f;
   }
}
