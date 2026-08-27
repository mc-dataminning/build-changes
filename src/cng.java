public class cng extends coy {
   public cng(coy.a $$0) {
      super($$0);
   }

   @Override
   public cpd a(cpd $$0, cvr $$1, boi $$2) {
      cpd $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.eh().j() - 0.5) * 16.0;
            double $$6 = awi.a($$2.dt() + (double)($$2.eh().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((aow)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.eh().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            enz $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dpw.R, $$8, dpw.a.a($$2));
               atm $$10;
               atk $$9;
               if ($$2 instanceof cah) {
                  $$9 = atl.jb;
                  $$10 = atm.g;
               } else {
                  $$9 = atl.eZ;
                  $$10 = atm.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof chl $$13) {
            $$13.go().a(this, 20);
         }
      }

      return $$3;
   }
}
