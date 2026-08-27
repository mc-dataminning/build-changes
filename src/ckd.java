public class ckd extends cjc {
   public ckd(cjc.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cjh $$0, cpx $$1, dfl $$2, gw $$3, bji $$4) {
      if (!$$1.B && !$$2.a(apu.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bix.a));
      }

      return !$$2.a(apu.O)
            && !$$2.a(csy.bs)
            && !$$2.a(csy.bt)
            && !$$2.a(csy.bu)
            && !$$2.a(csy.bv)
            && !$$2.a(csy.rF)
            && !$$2.a(csy.ff)
            && !$$2.a(csy.fI)
            && !$$2.a(apu.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dfl $$0) {
      return $$0.a(csy.bs) || $$0.a(csy.cw) || $$0.a(csy.fI);
   }

   @Override
   public float a(cjh $$0, dfl $$1) {
      if ($$1.a(csy.bs) || $$1.a(apu.O)) {
         return 15.0F;
      } else if ($$1.a(apu.a)) {
         return 5.0F;
      } else {
         return !$$1.a(csy.ff) && !$$1.a(csy.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cwk $$5 && !$$5.o($$3)) {
         cbw $$6 = $$0.o();
         cjh $$7 = $$0.n();
         if ($$6 instanceof akt) {
            al.M.a((akt)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, apf.ki, apg.e, 1.0F, 1.0F);
         dfl $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(djv.c, $$2, djv.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bha.a($$1.B);
      }

      return super.a($$0);
   }
}
