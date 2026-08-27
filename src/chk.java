public class chk extends cjc {
   public chk(cjc.a $$0) {
      super($$0);
   }

   @Override
   public cjh a(cjh $$0, cpx $$1, bji $$2) {
      cjh $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.dq();
         double $$5 = $$2.ds();
         double $$6 = $$2.dw();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.dq() + ($$2.ef().j() - 0.5) * 16.0;
            double $$9 = ary.a($$2.ds() + (double)($$2.ef().a(16) - 8), (double)$$1.H_(), (double)($$1.H_() + ((aks)$$1).j() - 1));
            double $$10 = $$2.dw() + ($$2.ef().j() - 0.5) * 16.0;
            if ($$2.bN()) {
               $$2.aa();
            }

            ehp $$11 = $$2.dj();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(djv.R, $$11, djv.a.a($$2));
               ape $$12 = $$2 instanceof bvd ? apf.ii : apf.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, apg.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cbw) {
            ((cbw)$$2).gm().a(this, 20);
         }
      }

      return $$3;
   }
}
