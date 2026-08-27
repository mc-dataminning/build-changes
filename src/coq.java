public class coq extends cqf {
   public coq(cqf.a $$0) {
      super($$0);
   }

   @Override
   public cqk a(cqk $$0, cwz $$1, bpo $$2) {
      cqk $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.ei().j() - 0.5) * 16.0;
            double $$6 = aww.a($$2.dt() + (double)($$2.ei().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((apf)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.ei().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            epr $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(drn.R, $$8, drn.a.a($$2));
               atz $$10;
               atx $$9;
               if ($$2 instanceof cbn) {
                  $$9 = aty.je;
                  $$10 = atz.g;
               } else {
                  $$9 = aty.fc;
                  $$10 = atz.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cis $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
