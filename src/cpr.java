public class cpr extends cre {
   public cpr(cre.a $$0) {
      super($$0);
   }

   @Override
   public crj a(crj $$0, cyx $$1, bqo $$2) {
      crj $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.ei().j() - 0.5) * 16.0;
            double $$6 = axk.a($$2.dt() + (double)($$2.ei().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aps)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.ei().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            esa $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dts.R, $$8, dts.a.a($$2));
               aun $$10;
               aul $$9;
               if ($$2 instanceof ccn) {
                  $$9 = aum.jk;
                  $$10 = aun.g;
               } else {
                  $$9 = aum.fh;
                  $$10 = aun.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cjt $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
