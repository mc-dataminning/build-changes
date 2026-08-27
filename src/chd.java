public class chd extends civ {
   public chd(civ.a $$0) {
      super($$0);
   }

   @Override
   public cja a(cja $$0, cpq $$1, bjb $$2) {
      cja $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.dp();
         double $$5 = $$2.dr();
         double $$6 = $$2.dv();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.dp() + ($$2.ee().j() - 0.5) * 16.0;
            double $$9 = ars.a($$2.dr() + (double)($$2.ee().a(16) - 8), (double)$$1.C_(), (double)($$1.C_() + ((akn)$$1).j() - 1));
            double $$10 = $$2.dv() + ($$2.ee().j() - 0.5) * 16.0;
            if ($$2.bN()) {
               $$2.aa();
            }

            ehi $$11 = $$2.di();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(djo.R, $$11, djo.a.a($$2));
               aoy $$12 = $$2 instanceof buw ? aoz.ii : aoz.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, apa.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cbp) {
            ((cbp)$$2).gl().a(this, 20);
         }
      }

      return $$3;
   }
}
