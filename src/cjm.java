public class cjm extends cle {
   public cjm(cle.a $$0) {
      super($$0);
   }

   @Override
   public clj a(clj $$0, csa $$1, blg $$2) {
      clj $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.ds();
         double $$5 = $$2.du();
         double $$6 = $$2.dy();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.ds() + ($$2.eh().j() - 0.5) * 16.0;
            double $$9 = atm.a($$2.du() + (double)($$2.eh().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((ame)$$1).j() - 1));
            double $$10 = $$2.dy() + ($$2.eh().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            eju $$11 = $$2.dl();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(dls.R, $$11, dls.a.a($$2));
               aqq $$12 = $$2 instanceof bxb ? aqr.iC : aqr.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, aqs.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cdu) {
            ((cdu)$$2).go().a(this, 20);
         }
      }

      return $$3;
   }
}
