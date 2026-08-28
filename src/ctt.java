public class ctt extends cvg {
   public ctt(cvg.a $$0) {
      super($$0);
   }

   @Override
   public cvl a(cvl $$0, dds $$1, buf $$2) {
      cvl $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dx() + ($$2.dV().j() - 0.5) * 16.0;
            double $$6 = azc.a($$2.dz() + (double)($$2.dV().a(16) - 8), (double)$$1.G_(), (double)($$1.G_() + ((arg)$$1).k() - 1));
            double $$7 = $$2.dD() + ($$2.dV().j() - 0.5) * 16.0;
            if ($$2.bW()) {
               $$2.af();
            }

            eye $$8 = $$2.dq();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dyx.R, $$8, dyx.a.a($$2));
               awe $$10;
               awc $$9;
               if ($$2 instanceof cgf) {
                  $$9 = awd.jq;
                  $$10 = awe.g;
               } else {
                  $$9 = awd.fi;
                  $$10 = awe.h;
               }

               $$1.a(null, $$2.dx(), $$2.dz(), $$2.dD(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cnp $$13) {
            $$13.gG();
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
