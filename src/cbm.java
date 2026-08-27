public class cbm extends caj {
   public cbm(bkm<? extends cbm> $$0, crs $$1) {
      super($$0, $$1);
   }

   public static boolean a(bkm<cbm> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      ht $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cuv.qC));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == blc.c || $$1.g($$5.d()));
   }

   @Override
   protected aqm w() {
      return aqn.xD;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.xF;
   }

   @Override
   protected aqm m_() {
      return aqn.xE;
   }

   @Override
   aqm t() {
      return aqn.xG;
   }

   @Override
   protected cds b(clb $$0, float $$1) {
      cds $$2 = super.b($$0, $$1);
      if ($$2 instanceof cdu) {
         ((cdu)$$2).a(new bjv(bjx.b, 600));
      }

      return $$2;
   }
}
