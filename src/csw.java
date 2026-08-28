public class csw extends cuj {
   public csw(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo a(cuo $$0, dbx $$1, bto $$2) {
      cuo $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.el().j() - 0.5) * 16.0;
            double $$6 = ayy.a($$2.dw() + (double)($$2.el().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((are)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.el().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            evq $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dwu.R, $$8, dwu.a.a($$2));
               awa $$10;
               avy $$9;
               if ($$2 instanceof cfo) {
                  $$9 = avz.jp;
                  $$10 = awa.g;
               } else {
                  $$9 = avz.fh;
                  $$10 = awa.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cmw $$13) {
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
