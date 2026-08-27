public class crh extends csu {
   public crh(csu.a $$0) {
      super($$0);
   }

   @Override
   public csz a(csz $$0, dad $$1, bsa $$2) {
      csz $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.ds() + ($$2.ej().j() - 0.5) * 16.0;
            double $$6 = axz.a($$2.du() + (double)($$2.ej().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqh)$$1).k() - 1));
            double $$7 = $$2.dy() + ($$2.ej().j() - 0.5) * 16.0;
            if ($$2.bP()) {
               $$2.ac();
            }

            etp $$8 = $$2.dl();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dva.R, $$8, dva.a.a($$2));
               avd $$10;
               avb $$9;
               if ($$2 instanceof cdz) {
                  $$9 = avc.jk;
                  $$10 = avd.g;
               } else {
                  $$9 = avc.fh;
                  $$10 = avd.h;
               }

               $$1.a(null, $$2.ds(), $$2.du(), $$2.dy(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof clh $$13) {
            $$13.gv().a(this, 20);
         }
      }

      return $$3;
   }
}
