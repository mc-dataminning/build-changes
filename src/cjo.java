public class cjo extends cik {
   public cjo(bsa<? extends cjo> $$0, dax $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsa<cjo> $$0, dbm $$1, bss $$2, io $$3, ayk $$4) {
      io $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dea.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bss.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avg v() {
      return avh.zj;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.zl;
   }

   @Override
   protected avg o_() {
      return avh.zk;
   }

   @Override
   avg u() {
      return avh.zm;
   }

   @Override
   protected cmc b(cto $$0, float $$1) {
      cmc $$2 = super.b($$0, $$1);
      if ($$2 instanceof cme) {
         ((cme)$$2).a(new brc(bre.b, 600));
      }

      return $$2;
   }
}
