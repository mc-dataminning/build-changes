public class chi extends cja {
   public chi(cja.a $$0) {
      super($$0);
   }

   @Override
   public cjf a(cjf $$0, cpv $$1, bjg $$2) {
      cjf $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.dq();
         double $$5 = $$2.ds();
         double $$6 = $$2.dw();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.dq() + ($$2.ef().j() - 0.5) * 16.0;
            double $$9 = arw.a($$2.ds() + (double)($$2.ef().a(16) - 8), (double)$$1.H_(), (double)($$1.H_() + ((akq)$$1).j() - 1));
            double $$10 = $$2.dw() + ($$2.ef().j() - 0.5) * 16.0;
            if ($$2.bN()) {
               $$2.aa();
            }

            ehn $$11 = $$2.dj();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(djt.R, $$11, djt.a.a($$2));
               apc $$12 = $$2 instanceof bvb ? apd.ii : apd.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, ape.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cbu) {
            ((cbu)$$2).gm().a(this, 20);
         }
      }

      return $$3;
   }
}
