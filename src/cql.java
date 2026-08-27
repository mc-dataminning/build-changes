public class cql extends cry {
   public cql(cry.a $$0) {
      super($$0);
   }

   @Override
   public csd a(csd $$0, czu $$1, bre $$2) {
      csd $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.ds() + ($$2.ej().j() - 0.5) * 16.0;
            double $$6 = axw.a($$2.du() + (double)($$2.ej().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqe)$$1).k() - 1));
            double $$7 = $$2.dy() + ($$2.ej().j() - 0.5) * 16.0;
            if ($$2.bP()) {
               $$2.ac();
            }

            etf $$8 = $$2.dl();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dur.R, $$8, dur.a.a($$2));
               ava $$10;
               auy $$9;
               if ($$2 instanceof cdd) {
                  $$9 = auz.jk;
                  $$10 = ava.g;
               } else {
                  $$9 = auz.fh;
                  $$10 = ava.h;
               }

               $$1.a(null, $$2.ds(), $$2.du(), $$2.dy(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof ckl $$13) {
            $$13.gv().a(this, 20);
         }
      }

      return $$3;
   }
}
