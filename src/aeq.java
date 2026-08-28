import java.util.Set;

public record aeq(int b, ezr c, ezr d, float e, float f, Set<bvs> g) implements zs<ach> {
   public static final zj<wi, aeq> a = zj.a(zh.h, aeq::b, ezr.b, aeq::e, ezr.b, aeq::f, zh.j, aeq::g, zh.j, aeq::h, bvs.m, aeq::i, aeq::new);

   public static aeq a(int $$0, bvr $$1, Set<bvs> $$2) {
      return new aeq($$0, $$1.a(), $$1.b(), $$1.c(), $$1.d(), $$2);
   }

   @Override
   public zu<aeq> a() {
      return agw.ai;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public ezr e() {
      return this.c;
   }

   public ezr f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public Set<bvs> i() {
      return this.g;
   }
}
