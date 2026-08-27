public class cyi extends dai {
   protected cyi(dey.d $$0) {
      super($$0);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      if ($$6.a(cja.rg)) {
         if (!$$1.B) {
            ha $$7 = $$5.b();
            ha $$8 = $$7.o() == ha.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, aow.tj, aox.e, 1.0F, 1.0F);
            $$1.a($$2, csm.ef.n().a(cte.a, $$8), 11);
            byf $$9 = new byf(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cix(cja.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, djj.M, $$2);
            $$3.b(apg.c.b(cja.rg));
         }

         return bgq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dah a() {
      return (dah)csm.fd;
   }

   @Override
   public crn b() {
      return (crn)csm.fb;
   }
}
