public class csl extends cty {
   public csl(cty.a $$0) {
      super($$0);
   }

   @Override
   public cud a(cud $$0, dcg $$1, btc $$2) {
      cud $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dw() + ($$2.dU().j() - 0.5) * 16.0;
            double $$6 = ayg.a($$2.dy() + (double)($$2.dU().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqm)$$1).k() - 1));
            double $$7 = $$2.dC() + ($$2.dU().j() - 0.5) * 16.0;
            if ($$2.bT()) {
               $$2.ad();
            }

            ewh $$8 = $$2.dp();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dxh.R, $$8, dxh.a.a($$2));
               avi $$10;
               avg $$9;
               if ($$2 instanceof cfc) {
                  $$9 = avh.jp;
                  $$10 = avi.g;
               } else {
                  $$9 = avh.fh;
                  $$10 = avi.h;
               }

               $$1.a(null, $$2.dw(), $$2.dy(), $$2.dC(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cml $$13) {
            $$13.gv().a(this, 20);
         }
      }

      return $$3;
   }
}
