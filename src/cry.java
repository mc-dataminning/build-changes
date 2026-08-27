public class cry extends ctl {
   public cry(ctl.a $$0) {
      super($$0);
   }

   @Override
   public ctq a(ctq $$0, daz $$1, bsq $$2) {
      ctq $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.du() + ($$2.el().j() - 0.5) * 16.0;
            double $$6 = ayf.a($$2.dw() + (double)($$2.el().a(16) - 8), (double)$$1.I_(), (double)($$1.I_() + ((aqn)$$1).k() - 1));
            double $$7 = $$2.dA() + ($$2.el().j() - 0.5) * 16.0;
            if ($$2.bR()) {
               $$2.ac();
            }

            eum $$8 = $$2.dn();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dvw.R, $$8, dvw.a.a($$2));
               avj $$10;
               avh $$9;
               if ($$2 instanceof ceq) {
                  $$9 = avi.jp;
                  $$10 = avj.g;
               } else {
                  $$9 = avi.fh;
                  $$10 = avj.h;
               }

               $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cly $$13) {
            $$13.gx().a(this, 20);
         }
      }

      return $$3;
   }
}
