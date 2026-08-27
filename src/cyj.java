public class cyj extends daj {
   protected cyj(dez.d $$0) {
      super($$0);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      if ($$6.a(cjb.rg)) {
         if (!$$1.B) {
            ha $$7 = $$5.b();
            ha $$8 = $$7.o() == ha.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, aow.tj, aox.e, 1.0F, 1.0F);
            $$1.a($$2, csn.ef.n().a(ctf.a, $$8), 11);
            byg $$9 = new byg(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new ciy(cjb.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, djk.M, $$2);
            $$3.b(apg.c.b(cjb.rg));
         }

         return bgq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dai a() {
      return (dai)csn.fd;
   }

   @Override
   public cro b() {
      return (cro)csn.fb;
   }
}
