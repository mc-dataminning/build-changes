public class cim extends cke {
   public cim(cke.a $$0) {
      super($$0);
   }

   @Override
   public ckj a(ckj $$0, cqz $$1, bkj $$2) {
      ckj $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.dq();
         double $$5 = $$2.ds();
         double $$6 = $$2.dw();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.dq() + ($$2.ef().j() - 0.5) * 16.0;
            double $$9 = asy.a($$2.ds() + (double)($$2.ef().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((alq)$$1).j() - 1));
            double $$10 = $$2.dw() + ($$2.ef().j() - 0.5) * 16.0;
            if ($$2.bN()) {
               $$2.aa();
            }

            eif $$11 = $$2.dj();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(dkl.R, $$11, dkl.a.a($$2));
               aqc $$12 = $$2 instanceof bwe ? aqd.ik : aqd.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, aqe.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof ccx) {
            ((ccx)$$2).gn().a(this, 20);
         }
      }

      return $$3;
   }
}
