public class csy extends cul {
   public csy(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq a(cuq $$0, dbz $$1, btq $$2) {
      cuq $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.el().j() - 0.5) * 16.0;
            double $$6 = ayz.a($$2.dw() + (double)($$2.el().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((arf)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.el().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            evs $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dww.R, $$8, dww.a.a($$2));
               awb $$10;
               avz $$9;
               if ($$2 instanceof cfq) {
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

         if ($$2 instanceof cmy $$13) {
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
