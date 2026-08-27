public class cyu extends dau {
   protected cyu(dfk.d $$0) {
      super($$0);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      if ($$6.a(cjk.rg)) {
         if (!$$1.B) {
            hc $$7 = $$5.b();
            hc $$8 = $$7.o() == hc.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, apf.tj, apg.e, 1.0F, 1.0F);
            $$1.a($$2, csy.ef.n().a(ctq.a, $$8), 11);
            byp $$9 = new byp(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cjh(cjk.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, djv.M, $$2);
            $$3.b(app.c.b(cjk.rg));
         }

         return bha.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dat a() {
      return (dat)csy.fd;
   }

   @Override
   public crz b() {
      return (crz)csy.fb;
   }
}
