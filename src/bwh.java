import com.google.common.collect.ImmutableMap;

public class bwh extends bvg<btp> {
   public static final int c = 100;
   private final bqd d;
   private final avy e;

   public bwh(bqd $$0, avy $$1) {
      super(ImmutableMap.of(ccr.n, ccs.c, ccr.T, ccs.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(are $$0, btp $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(are $$0, btp $$1, long $$2) {
      $$1.q(true);
      $$1.b(btz.g);
   }

   protected void c(are $$0, btp $$1, long $$2) {
      if ($$1.aE()) {
         $$1.h($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awa.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(btz.a);
      $$1.dS().b(ccr.T);
      $$1.dS().a(ccr.S, this.d.a($$0.z));
   }
}
