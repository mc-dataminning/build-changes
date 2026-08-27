public class cyn extends dan {
   protected cyn(dfd.d $$0) {
      super($$0);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      if ($$6.a(cjd.rg)) {
         if (!$$1.B) {
            hc $$7 = $$5.b();
            hc $$8 = $$7.o() == hc.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, aoz.tj, apa.e, 1.0F, 1.0F);
            $$1.a($$2, csr.ef.n().a(ctj.a, $$8), 11);
            byi $$9 = new byi(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cja(cjd.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, djo.M, $$2);
            $$3.b(apj.c.b(cjd.rg));
         }

         return bgt.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dam a() {
      return (dam)csr.fd;
   }

   @Override
   public crs b() {
      return (crs)csr.fb;
   }
}
