public class chl extends cgh {
   public chl(bqb<? extends chl> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bqb<chl> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      ib $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dca.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bqs.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected aul v() {
      return aum.yQ;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.yS;
   }

   @Override
   protected aul o_() {
      return aum.yR;
   }

   @Override
   aul u() {
      return aum.yT;
   }

   @Override
   protected cjz b(crj $$0, float $$1) {
      cjz $$2 = super.b($$0, $$1);
      if ($$2 instanceof ckb) {
         ((ckb)$$2).a(new bph(bpj.b, 600));
      }

      return $$2;
   }
}
