public class csi extends ctv {
   public csi(ctv.a $$0) {
      super($$0);
   }

   @Override
   public cua a(cua $$0, dcd $$1, bsy $$2) {
      cua $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.dS().j() - 0.5) * 16.0;
            double $$6 = aye.a($$2.dw() + (double)($$2.dS().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqk)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.dS().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            evz $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dxa.R, $$8, dxa.a.a($$2));
               avg $$10;
               ave $$9;
               if ($$2 instanceof cey) {
                  $$9 = avf.jp;
                  $$10 = avg.g;
               } else {
                  $$9 = avf.fh;
                  $$10 = avg.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cmh $$13) {
            $$13.gt().a(this, 20);
         }
      }

      return $$3;
   }
}
