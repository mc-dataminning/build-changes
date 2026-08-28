public class css extends cuf {
   public css(cuf.a $$0) {
      super($$0);
   }

   @Override
   public cuk a(cuk $$0, dbt $$1, btk $$2) {
      cuk $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.el().j() - 0.5) * 16.0;
            double $$6 = ayu.a($$2.dw() + (double)($$2.el().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((arb)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.el().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            evm $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dwq.R, $$8, dwq.a.a($$2));
               avx $$10;
               avv $$9;
               if ($$2 instanceof cfk) {
                  $$9 = avw.jp;
                  $$10 = avx.g;
               } else {
                  $$9 = avw.fh;
                  $$10 = avx.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cms $$13) {
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
