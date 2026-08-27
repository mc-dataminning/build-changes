public class cnd extends cmc {
   public cnd(cmc.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cmh $$0, csy $$1, dip $$2, hv $$3, blv $$4) {
      if (!$$1.B && !$$2.a(arr.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(blk.a));
      }

      return !$$2.a(arr.O)
            && !$$2.a(cwb.bs)
            && !$$2.a(cwb.bt)
            && !$$2.a(cwb.bu)
            && !$$2.a(cwb.bv)
            && !$$2.a(cwb.sG)
            && !$$2.a(cwb.ff)
            && !$$2.a(cwb.fI)
            && !$$2.a(arr.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dip $$0) {
      return $$0.a(cwb.bs) || $$0.a(cwb.cw) || $$0.a(cwb.fI);
   }

   @Override
   public float a(cmh $$0, dip $$1) {
      if ($$1.a(cwb.bs) || $$1.a(arr.O)) {
         return 15.0F;
      } else if ($$1.a(arr.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cwb.ff) && !$$1.a(cwb.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if ($$3.b() instanceof czo $$5 && !$$5.o($$3)) {
         cer $$6 = $$0.o();
         cmh $$7 = $$0.n();
         if ($$6 instanceof amq) {
            am.N.a((amq)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, arc.kL, ard.e, 1.0F, 1.0F);
         dip $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dmz.c, $$2, dmz.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bjl.a($$1.B);
      }

      return super.a($$0);
   }
}
