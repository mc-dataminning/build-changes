public class cqm extends cpl {
   public cqm(cpl.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpq $$0, cwe $$1, dme $$2, ib $$3, box $$4) {
      if (!$$1.B && !$$2.a(aue.aJ)) {
         $$0.a(1, $$4, bom.a);
      }

      return !$$2.a(aue.O)
            && !$$2.a(czh.bs)
            && !$$2.a(czh.bt)
            && !$$2.a(czh.bu)
            && !$$2.a(czh.bv)
            && !$$2.a(czh.sG)
            && !$$2.a(czh.ff)
            && !$$2.a(czh.fI)
            && !$$2.a(aue.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dme $$0) {
      return $$0.a(czh.bs) || $$0.a(czh.cw) || $$0.a(czh.fI);
   }

   @Override
   public float a(cpq $$0, dme $$1) {
      if ($$1.a(czh.bs) || $$1.a(aue.O)) {
         return 15.0F;
      } else if ($$1.a(aue.a)) {
         return 5.0F;
      } else {
         return !$$1.a(czh.ff) && !$$1.a(czh.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dcu $$5 && !$$5.o($$3)) {
         cia $$6 = $$0.o();
         cpq $$7 = $$0.n();
         if ($$6 instanceof apb) {
            am.N.a((apb)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, atp.lb, atq.e, 1.0F, 1.0F);
         dme $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dqr.c, $$2, dqr.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, box.d($$0.p()));
         }

         return bml.a($$1.B);
      }

      return super.a($$0);
   }
}
