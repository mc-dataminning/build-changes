import java.util.Set;

public record aem(int b, ezh c, ezh d, float e, float f, Set<bvj> g) implements zo<acd> {
   public static final zf<we, aem> a = zf.a(zd.h, aem::b, ezh.b, aem::e, ezh.b, aem::f, zd.d, aem::g, zd.d, aem::h, bvj.m, aem::i, aem::new);

   public static aem a(int $$0, bvi $$1, Set<bvj> $$2) {
      return new aem($$0, $$1.a(), $$1.b(), $$1.c(), $$1.d(), $$2);
   }

   @Override
   public zq<aem> a() {
      return ags.ai;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public ezh e() {
      return this.c;
   }

   public ezh f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public Set<bvj> i() {
      return this.g;
   }
}
