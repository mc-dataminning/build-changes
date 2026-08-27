public class cyh extends dah {
   protected cyh(dex.d $$0) {
      super($$0);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      if ($$6.a(ciz.rg)) {
         if (!$$1.B) {
            hb $$7 = $$5.b();
            hb $$8 = $$7.o() == hb.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, aou.tj, aov.e, 1.0F, 1.0F);
            $$1.a($$2, csl.ef.n().a(ctd.a, $$8), 11);
            bye $$9 = new bye(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new ciw(ciz.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dji.M, $$2);
            $$3.b(ape.c.b(ciz.rg));
         }

         return bgo.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dag a() {
      return (dag)csl.fd;
   }

   @Override
   public crm b() {
      return (crm)csl.fb;
   }
}
