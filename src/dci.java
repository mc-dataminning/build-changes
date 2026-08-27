public class dci extends cvv {
   public dci(bid $$0, dfk.d $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csy.dW) || $$0.a(csy.dX) || $$0.a(csy.dY);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      eii $$4 = this.a($$0, $$1, $$2, ehu.a());
      ehp $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ix.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B && $$1.ai() != bgx.a) {
         if ($$3 instanceof bji $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bif(bih.t, 40));
         }
      }
   }
}
