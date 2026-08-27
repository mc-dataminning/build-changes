public class crg extends cpn {
   public crg(dca.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$3.a(5) == 0) {
         ha $$4 = ha.b($$3);
         if ($$4 != ha.b) {
            gu $$5 = $$2.a($$4);
            dcb $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(iv.ay, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
