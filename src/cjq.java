public class cjq extends cim {
   public cjq(bsc<? extends cjq> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsc<cjq> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      io $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dec.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bsu.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avh v() {
      return avi.zj;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.zl;
   }

   @Override
   protected avh o_() {
      return avi.zk;
   }

   @Override
   avh u() {
      return avi.zm;
   }

   @Override
   protected cme b(ctq $$0, float $$1) {
      cme $$2 = super.b($$0, $$1);
      if ($$2 instanceof cmg) {
         ((cmg)$$2).a(new bre(brg.b, 600));
      }

      return $$2;
   }
}
