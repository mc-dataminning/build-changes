public class ckp extends cjl {
   public ckp(bta<? extends ckp> $$0, dby $$1) {
      super($$0, $$1);
   }

   public static boolean a(bta<ckp> $$0, dcn $$1, btt $$2, iz $$3, azh $$4) {
      iz $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfb.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btt.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avz v() {
      return awa.zj;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.zl;
   }

   @Override
   protected avz o_() {
      return awa.zk;
   }

   @Override
   avz u() {
      return awa.zm;
   }

   @Override
   protected cnd b(cup $$0, float $$1) {
      cnd $$2 = super.b($$0, $$1);
      if ($$2 instanceof cnf) {
         ((cnf)$$2).a(new bsc(bse.b, 600));
      }

      return $$2;
   }
}
