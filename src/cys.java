public class cys extends das {
   protected cys(dfi.d $$0) {
      super($$0);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      if ($$6.a(cji.rg)) {
         if (!$$1.B) {
            hc $$7 = $$5.b();
            hc $$8 = $$7.o() == hc.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, ape.tj, apf.e, 1.0F, 1.0F);
            $$1.a($$2, csw.ef.n().a(cto.a, $$8), 11);
            byn $$9 = new byn(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cjf(cji.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, djt.M, $$2);
            $$3.b(apo.c.b(cji.rg));
         }

         return bgy.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dar a() {
      return (dar)csw.fd;
   }

   @Override
   public crx b() {
      return (crx)csw.fb;
   }
}
