public class csx extends cuk {
   public csx(cuk.a $$0) {
      super($$0);
   }

   @Override
   public cup a(cup $$0, dby $$1, btp $$2) {
      cup $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.el().j() - 0.5) * 16.0;
            double $$6 = ayz.a($$2.dw() + (double)($$2.el().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((arf)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.el().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            evr $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dwv.R, $$8, dwv.a.a($$2));
               awb $$10;
               avz $$9;
               if ($$2 instanceof cfp) {
                  $$9 = awa.jp;
                  $$10 = awb.g;
               } else {
                  $$9 = awa.fh;
                  $$10 = awb.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cmx $$13) {
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
