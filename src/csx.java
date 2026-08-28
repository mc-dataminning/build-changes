public class csx extends cul {
   public csx(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq a(cuq $$0, dcw $$1, btn $$2) {
      cuq $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.dS().j() - 0.5) * 16.0;
            double $$6 = ayo.a($$2.dw() + (double)($$2.dS().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqu)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.dS().j() - 0.5) * 16.0;
            if ($$2.bS()) {
               $$2.ad();
            }

            exa $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dxz.R, $$8, dxz.a.a($$2));
               avq $$10;
               avo $$9;
               if ($$2 instanceof cfo) {
                  $$9 = avp.jp;
                  $$10 = avq.g;
               } else {
                  $$9 = avp.fh;
                  $$10 = avq.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cmx $$13) {
            $$13.gu().a(this, 20);
         }
      }

      return $$3;
   }
}
