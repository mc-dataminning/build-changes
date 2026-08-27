public class cjs extends cir {
   public cjs(cir.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(ciw $$0, cpk $$1, dey $$2, gv $$3, biw $$4) {
      if (!$$1.B && !$$2.a(apj.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bil.a));
      }

      return !$$2.a(apj.O)
            && !$$2.a(csl.bs)
            && !$$2.a(csl.bt)
            && !$$2.a(csl.bu)
            && !$$2.a(csl.bv)
            && !$$2.a(csl.rF)
            && !$$2.a(csl.ff)
            && !$$2.a(csl.fI)
            && !$$2.a(apj.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dey $$0) {
      return $$0.a(csl.bs) || $$0.a(csl.cw) || $$0.a(csl.fI);
   }

   @Override
   public float a(ciw $$0, dey $$1) {
      if ($$1.a(csl.bs) || $$1.a(apj.O)) {
         return 15.0F;
      } else if ($$1.a(apj.a)) {
         return 5.0F;
      } else {
         return !$$1.a(csl.ff) && !$$1.a(csl.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cvx $$5 && !$$5.o($$3)) {
         cbl $$6 = $$0.o();
         ciw $$7 = $$0.n();
         if ($$6 instanceof akj) {
            ai.M.a((akj)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aou.ki, aov.e, 1.0F, 1.0F);
         dey $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dji.c, $$2, dji.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bgo.a($$1.B);
      }

      return super.a($$0);
   }
}
