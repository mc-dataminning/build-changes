public class crw extends ctj {
   public crw(ctj.a $$0) {
      super($$0);
   }

   @Override
   public cto a(cto $$0, dax $$1, bso $$2) {
      cto $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.el().j() - 0.5) * 16.0;
            double $$6 = ayd.a($$2.dw() + (double)($$2.el().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqm)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.el().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            euk $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dvu.R, $$8, dvu.a.a($$2));
               avi $$10;
               avg $$9;
               if ($$2 instanceof ceo) {
                  $$9 = avh.jp;
                  $$10 = avi.g;
               } else {
                  $$9 = avh.fh;
                  $$10 = avi.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof clw $$13) {
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
