public class cju extends cit {
   public cju(cit.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(ciy $$0, cpm $$1, dfa $$2, gu $$3, biy $$4) {
      if (!$$1.B && !$$2.a(apl.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bin.a));
      }

      return !$$2.a(apl.O)
            && !$$2.a(csn.bs)
            && !$$2.a(csn.bt)
            && !$$2.a(csn.bu)
            && !$$2.a(csn.bv)
            && !$$2.a(csn.rF)
            && !$$2.a(csn.ff)
            && !$$2.a(csn.fI)
            && !$$2.a(apl.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dfa $$0) {
      return $$0.a(csn.bs) || $$0.a(csn.cw) || $$0.a(csn.fI);
   }

   @Override
   public float a(ciy $$0, dfa $$1) {
      if ($$1.a(csn.bs) || $$1.a(apl.O)) {
         return 15.0F;
      } else if ($$1.a(apl.a)) {
         return 5.0F;
      } else {
         return !$$1.a(csn.ff) && !$$1.a(csn.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cvz $$5 && !$$5.o($$3)) {
         cbn $$6 = $$0.o();
         ciy $$7 = $$0.n();
         if ($$6 instanceof akl) {
            ai.M.a((akl)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aow.ki, aox.e, 1.0F, 1.0F);
         dfa $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(djk.c, $$2, djk.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bgq.a($$1.B);
      }

      return super.a($$0);
   }
}
