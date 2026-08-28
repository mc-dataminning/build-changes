public class csk extends ctx {
   public csk(ctx.a $$0) {
      super($$0);
   }

   @Override
   public cuc a(cuc $$0, dcf $$1, btb $$2) {
      cuc $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dv() + ($$2.dT().j() - 0.5) * 16.0;
            double $$6 = ayg.a($$2.dx() + (double)($$2.dT().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqm)$$1).k() - 1));
            double $$7 = $$2.dB() + ($$2.dT().j() - 0.5) * 16.0;
            if ($$2.bS()) {
               $$2.ac();
            }

            ewf $$8 = $$2.do();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dxg.R, $$8, dxg.a.a($$2));
               avi $$10;
               avg $$9;
               if ($$2 instanceof cfb) {
                  $$9 = avh.jp;
                  $$10 = avi.g;
               } else {
                  $$9 = avh.fh;
                  $$10 = avi.h;
               }

               $$1.a(null, $$2.dv(), $$2.dx(), $$2.dB(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cmk $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
