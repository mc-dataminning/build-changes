public class clb extends cmt {
   public clb(cmt.a $$0) {
      super($$0);
   }

   @Override
   public cmy a(cmy $$0, ctp $$1, bml $$2) {
      cmy $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.eg().j() - 0.5) * 16.0;
            double $$6 = auo.a($$2.dt() + (double)($$2.eg().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((and)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.eg().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            elt $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dnr.R, $$8, dnr.a.a($$2));
               art $$10;
               arr $$9;
               if ($$2 instanceof byi) {
                  $$9 = ars.iL;
                  $$10 = art.g;
               } else {
                  $$9 = ars.eJ;
                  $$10 = art.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cfi $$13) {
            $$13.gn().a(this, 20);
         }
      }

      return $$3;
   }
}
