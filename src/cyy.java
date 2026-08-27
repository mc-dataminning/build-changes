public class cyy extends csl {
   public cyy(bey $$0, dca.d $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cpo.dW) || $$0.a(cpo.dX) || $$0.a(cpo.dY);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      efb $$4 = this.a($$0, $$1, $$2, een.a());
      eei $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(iv.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!$$1.B && $$1.ai() != bdu.a) {
         if ($$3 instanceof bfz $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bfa(bfc.t, 40));
         }
      }
   }
}
