public class cqa extends crn {
   public cqa(crn.a $$0) {
      super($$0);
   }

   @Override
   public crs a(crs $$0, czg $$1, bqt $$2) {
      crs $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.ei().j() - 0.5) * 16.0;
            double $$6 = axm.a($$2.dt() + (double)($$2.ei().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((apu)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.ei().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            esj $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dub.R, $$8, dub.a.a($$2));
               aup $$10;
               aun $$9;
               if ($$2 instanceof ccs) {
                  $$9 = auo.jk;
                  $$10 = aup.g;
               } else {
                  $$9 = auo.fh;
                  $$10 = aup.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cka $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
