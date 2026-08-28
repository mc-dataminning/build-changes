public class csv extends cuj {
   public csv(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo a(cuo $$0, dcu $$1, btl $$2) {
      cuo $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dv() + ($$2.dT().j() - 0.5) * 16.0;
            double $$6 = ayn.a($$2.dx() + (double)($$2.dT().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqt)$$1).k() - 1));
            double $$7 = $$2.dB() + ($$2.dT().j() - 0.5) * 16.0;
            if ($$2.bS()) {
               $$2.ad();
            }

            eww $$8 = $$2.do();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dxw.R, $$8, dxw.a.a($$2));
               avp $$10;
               avn $$9;
               if ($$2 instanceof cfm) {
                  $$9 = avo.jp;
                  $$10 = avp.g;
               } else {
                  $$9 = avo.fh;
                  $$10 = avp.h;
               }

               $$1.a(null, $$2.dv(), $$2.dx(), $$2.dB(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cmv $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
