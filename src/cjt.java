public class cjt extends cis {
   public cjt(cis.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cix $$0, cpl $$1, dez $$2, gu $$3, biy $$4) {
      if (!$$1.B && !$$2.a(apl.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bin.a));
      }

      return !$$2.a(apl.O)
            && !$$2.a(csm.bs)
            && !$$2.a(csm.bt)
            && !$$2.a(csm.bu)
            && !$$2.a(csm.bv)
            && !$$2.a(csm.rF)
            && !$$2.a(csm.ff)
            && !$$2.a(csm.fI)
            && !$$2.a(apl.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dez $$0) {
      return $$0.a(csm.bs) || $$0.a(csm.cw) || $$0.a(csm.fI);
   }

   @Override
   public float a(cix $$0, dez $$1) {
      if ($$1.a(csm.bs) || $$1.a(apl.O)) {
         return 15.0F;
      } else if ($$1.a(apl.a)) {
         return 5.0F;
      } else {
         return !$$1.a(csm.ff) && !$$1.a(csm.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cvy $$5 && !$$5.o($$3)) {
         cbm $$6 = $$0.o();
         cix $$7 = $$0.n();
         if ($$6 instanceof akl) {
            ai.M.a((akl)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aow.ki, aox.e, 1.0F, 1.0F);
         dez $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(djj.c, $$2, djj.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bgq.a($$1.B);
      }

      return super.a($$0);
   }
}
