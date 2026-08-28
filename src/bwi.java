import com.google.common.collect.ImmutableMap;

public class bwi extends bvh<btq> {
   public static final int c = 100;
   private final bqe d;
   private final avy e;

   public bwi(bqe $$0, avy $$1) {
      super(ImmutableMap.of(ccs.n, cct.c, ccs.T, cct.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(are $$0, btq $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(are $$0, btq $$1, long $$2) {
      $$1.q(true);
      $$1.b(bua.g);
   }

   protected void c(are $$0, btq $$1, long $$2) {
      if ($$1.aE()) {
         $$1.h($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awa.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bua.a);
      $$1.dS().b(ccs.T);
      $$1.dS().a(ccs.S, this.d.a($$0.z));
   }
}
