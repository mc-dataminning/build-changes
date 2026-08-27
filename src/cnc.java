public class cnc extends cou {
   public cnc(cou.a $$0) {
      super($$0);
   }

   @Override
   public coz a(coz $$0, cvn $$1, bog $$2) {
      coz $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.eh().j() - 0.5) * 16.0;
            double $$6 = awh.a($$2.dt() + (double)($$2.eh().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((aov)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.eh().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            ens $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dpp.R, $$8, dpp.a.a($$2));
               atl $$10;
               atj $$9;
               if ($$2 instanceof cad) {
                  $$9 = atk.ja;
                  $$10 = atl.g;
               } else {
                  $$9 = atk.eY;
                  $$10 = atl.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof chh $$13) {
            $$13.go().a(this, 20);
         }
      }

      return $$3;
   }
}
