public class ckk extends cmc {
   public ckk(cmc.a $$0) {
      super($$0);
   }

   @Override
   public cmh a(cmh $$0, csy $$1, blv $$2) {
      cmh $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dr() + ($$2.eg().j() - 0.5) * 16.0;
            double $$6 = aty.a($$2.dt() + (double)($$2.eg().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((amp)$$1).j() - 1));
            double $$7 = $$2.dx() + ($$2.eg().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            elb $$8 = $$2.dk();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dmz.R, $$8, dmz.a.a($$2));
               ard $$10;
               arb $$9;
               if ($$2 instanceof bxs) {
                  $$9 = arc.iL;
                  $$10 = ard.g;
               } else {
                  $$9 = arc.eJ;
                  $$10 = ard.h;
               }

               $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cer $$13) {
            $$13.gn().a(this, 20);
         }
      }

      return $$3;
   }
}
