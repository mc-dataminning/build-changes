public class cax extends bzu {
   public cax(bjx<? extends cax> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bjx<cax> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      ht $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cuc.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bkn.c || $$1.g($$5.d()));
   }

   @Override
   protected aqc w() {
      return aqd.xB;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.xD;
   }

   @Override
   protected aqc m_() {
      return aqd.xC;
   }

   @Override
   aqc t() {
      return aqd.xE;
   }

   @Override
   protected cdd b(ckj $$0, float $$1) {
      cdd $$2 = super.b($$0, $$1);
      if ($$2 instanceof cdf) {
         ((cdf)$$2).a(new bjg(bji.b, 600));
      }

      return $$2;
   }
}
