public class cje extends ckw {
   public cje(ckw.a $$0) {
      super($$0);
   }

   @Override
   public clb a(clb $$0, crs $$1, bky $$2) {
      clb $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.dq();
         double $$5 = $$2.ds();
         double $$6 = $$2.dw();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.dq() + ($$2.ef().j() - 0.5) * 16.0;
            double $$9 = ati.a($$2.ds() + (double)($$2.ef().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((ama)$$1).j() - 1));
            double $$10 = $$2.dw() + ($$2.ef().j() - 0.5) * 16.0;
            if ($$2.bN()) {
               $$2.aa();
            }

            eji $$11 = $$2.dj();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(dlg.R, $$11, dlg.a.a($$2));
               aqm $$12 = $$2 instanceof bwt ? aqn.im : aqn.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, aqo.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cdm) {
            ((cdm)$$2).gn().a(this, 20);
         }
      }

      return $$3;
   }
}
