public class clk extends cnb {
   public clk(cnb.a $$0) {
      super($$0);
   }

   @Override
   public cng a(cng $$0, ctx $$1, bmo $$2) {
      cng $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dq() + ($$2.eg().j() - 0.5) * 16.0;
            double $$6 = aup.a($$2.ds() + (double)($$2.eg().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((ane)$$1).k() - 1));
            double $$7 = $$2.dw() + ($$2.eg().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            emc $$8 = $$2.dj();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dnz.R, $$8, dnz.a.a($$2));
               aru $$10;
               ars $$9;
               if ($$2 instanceof bym) {
                  $$9 = art.ja;
                  $$10 = aru.g;
               } else {
                  $$9 = art.eY;
                  $$10 = aru.h;
               }

               $$1.a(null, $$2.dq(), $$2.ds(), $$2.dw(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cfq $$13) {
            $$13.gn().a(this, 20);
         }
      }

      return $$3;
   }
}
