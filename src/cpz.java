public class cpz extends coy {
   public cpz(coy.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpd $$0, cvr $$1, dlj $$2, hz $$3, boi $$4) {
      if (!$$1.B && !$$2.a(aua.aJ)) {
         $$0.a(1, $$4, bnx.a);
      }

      return !$$2.a(aua.O)
            && !$$2.a(cyu.bs)
            && !$$2.a(cyu.bt)
            && !$$2.a(cyu.bu)
            && !$$2.a(cyu.bv)
            && !$$2.a(cyu.sG)
            && !$$2.a(cyu.ff)
            && !$$2.a(cyu.fI)
            && !$$2.a(aua.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dlj $$0) {
      return $$0.a(cyu.bs) || $$0.a(cyu.cw) || $$0.a(cyu.fI);
   }

   @Override
   public float a(cpd $$0, dlj $$1) {
      if ($$1.a(cyu.bs) || $$1.a(aua.O)) {
         return 15.0F;
      } else if ($$1.a(aua.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cyu.ff) && !$$1.a(cyu.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dch $$5 && !$$5.o($$3)) {
         chl $$6 = $$0.o();
         cpd $$7 = $$0.n();
         if ($$6 instanceof aox) {
            am.N.a((aox)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, atl.lb, atm.e, 1.0F, 1.0F);
         dlj $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dpw.c, $$2, dpw.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, boi.d($$0.p()));
         }

         return blw.a($$1.B);
      }

      return super.a($$0);
   }
}
