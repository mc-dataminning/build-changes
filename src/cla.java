public class cla extends cms {
   public cla(cms.a $$0) {
      super($$0);
   }

   @Override
   public cmx a(cmx $$0, cto $$1, bmk $$2) {
      cmx $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.eg().j() - 0.5) * 16.0;
            double $$6 = aun.a($$2.dt() + (double)($$2.eg().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((and)$$1).k() - 1));
            double $$7 = $$2.dx() + ($$2.eg().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            els $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dnq.R, $$8, dnq.a.a($$2));
               ars $$10;
               arq $$9;
               if ($$2 instanceof byh) {
                  $$9 = arr.iL;
                  $$10 = ars.g;
               } else {
                  $$9 = arr.eJ;
                  $$10 = ars.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cfh $$13) {
            $$13.gn().a(this, 20);
         }
      }

      return $$3;
   }
}
