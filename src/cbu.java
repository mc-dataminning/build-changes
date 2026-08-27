public class cbu extends car {
   public cbu(bku<? extends cbu> $$0, csa $$1) {
      super($$0, $$1);
   }

   public static boolean a(bku<cbu> $$0, csp $$1, blk $$2, ht $$3, ats $$4) {
      ht $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cvc.qP));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == blk.c || $$1.g($$5.d()));
   }

   @Override
   protected aqq y() {
      return aqr.xU;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.xW;
   }

   @Override
   protected aqq m_() {
      return aqr.xV;
   }

   @Override
   aqq w() {
      return aqr.xX;
   }

   @Override
   protected cea b(clj $$0, float $$1) {
      cea $$2 = super.b($$0, $$1);
      if ($$2 instanceof cec) {
         ((cec)$$2).a(new bkd(bkf.b, 600));
      }

      return $$2;
   }
}
