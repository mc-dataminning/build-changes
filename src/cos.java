public class cos extends cqh {
   public cos(cqh.a $$0) {
      super($$0);
   }

   @Override
   public cqm a(cqm $$0, cxb $$1, bpp $$2) {
      cqm $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.ei().j() - 0.5) * 16.0;
            double $$6 = aww.a($$2.dt() + (double)($$2.ei().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((apf)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.ei().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            ept $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(drp.R, $$8, drp.a.a($$2));
               atz $$10;
               atx $$9;
               if ($$2 instanceof cbo) {
                  $$9 = aty.ji;
                  $$10 = atz.g;
               } else {
                  $$9 = aty.fg;
                  $$10 = atz.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof ciu $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
