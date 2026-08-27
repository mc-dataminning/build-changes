public class crg extends cqf {
   public crg(cqf.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cqk $$0, cwz $$1, dmz $$2, ib $$3, bpo $$4) {
      if (!$$1.B && !$$2.a(aun.aK)) {
         $$0.a(1, $$4, bpd.a);
      }

      return !$$2.a(aun.O)
            && !$$2.a(dac.bs)
            && !$$2.a(dac.bt)
            && !$$2.a(dac.bu)
            && !$$2.a(dac.bv)
            && !$$2.a(dac.sG)
            && !$$2.a(dac.ff)
            && !$$2.a(dac.fI)
            && !$$2.a(aun.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dmz $$0) {
      return $$0.a(dac.bs) || $$0.a(dac.cw) || $$0.a(dac.fI);
   }

   @Override
   public float a(cqk $$0, dmz $$1) {
      if ($$1.a(dac.bs) || $$1.a(aun.O)) {
         return 15.0F;
      } else if ($$1.a(aun.a)) {
         return 5.0F;
      } else {
         return !$$1.a(dac.ff) && !$$1.a(dac.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if ($$3.b() instanceof ddp $$5 && !$$5.o($$3)) {
         cis $$6 = $$0.o();
         cqk $$7 = $$0.n();
         if ($$6 instanceof apg) {
            am.N.a((apg)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aty.le, atz.e, 1.0F, 1.0F);
         dmz $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(drn.c, $$2, drn.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bpo.d($$0.p()));
         }

         return bnc.a($$1.B);
      }

      return super.a($$0);
   }
}
