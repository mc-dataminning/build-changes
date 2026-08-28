import java.util.Set;

public record aeo(int b, ezy c, ezy d, float e, float f, Set<bvv> g) implements zq<acf> {
   public static final zh<wg, aeo> a = zh.a(zf.h, aeo::b, ezy.b, aeo::e, ezy.b, aeo::f, zf.k, aeo::g, zf.k, aeo::h, bvv.m, aeo::i, aeo::new);

   public static aeo a(int $$0, bvu $$1, Set<bvv> $$2) {
      return new aeo($$0, $$1.a(), $$1.b(), $$1.c(), $$1.d(), $$2);
   }

   @Override
   public zs<aeo> a() {
      return agu.ai;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public ezy e() {
      return this.c;
   }

   public ezy f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public Set<bvv> i() {
      return this.g;
   }
}
