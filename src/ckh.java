public class ckh extends cjg {
   public ckh(cjg.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cjl $$0, cqb $$1, dfd $$2, gw $$3, bjm $$4) {
      if (!$$1.B && !$$2.a(apv.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bjb.a));
      }

      return !$$2.a(apv.O)
            && !$$2.a(cte.bs)
            && !$$2.a(cte.bt)
            && !$$2.a(cte.bu)
            && !$$2.a(cte.bv)
            && !$$2.a(cte.rF)
            && !$$2.a(cte.ff)
            && !$$2.a(cte.fI)
            && !$$2.a(apv.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dfd $$0) {
      return $$0.a(cte.bs) || $$0.a(cte.cw) || $$0.a(cte.fI);
   }

   @Override
   public float a(cjl $$0, dfd $$1) {
      if ($$1.a(cte.bs) || $$1.a(apv.O)) {
         return 15.0F;
      } else if ($$1.a(apv.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cte.ff) && !$$1.a(cte.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cwq $$5 && !$$5.o($$3)) {
         cca $$6 = $$0.o();
         cjl $$7 = $$0.n();
         if ($$6 instanceof aku) {
            al.M.a((aku)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, apg.ki, aph.e, 1.0F, 1.0F);
         dfd $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(djn.c, $$2, djn.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bhe.a($$1.B);
      }

      return super.a($$0);
   }
}
