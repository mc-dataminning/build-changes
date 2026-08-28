import java.util.Set;

public record aed(int b, bxp c, Set<bxq> d) implements zf<abu> {
   public static final yw<vu, aed> a = yw.a(yu.h, aed::b, bxp.a, aed::e, bxq.m, aed::f, aed::new);

   public static aed a(int $$0, bxp $$1, Set<bxq> $$2) {
      return new aed($$0, $$1, $$2);
   }

   @Override
   public zh<aed> a() {
      return agn.ai;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bxp e() {
      return this.c;
   }

   public Set<bxq> f() {
      return this.d;
   }
}
