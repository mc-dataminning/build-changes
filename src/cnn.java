public class cnn extends cmm {
   public cnn(cmm.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cmr $$0, cti $$1, dja $$2, hx $$3, bmf $$4) {
      if (!$$1.B && !$$2.a(asb.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(blu.a));
      }

      return !$$2.a(asb.O)
            && !$$2.a(cwl.bs)
            && !$$2.a(cwl.bt)
            && !$$2.a(cwl.bu)
            && !$$2.a(cwl.bv)
            && !$$2.a(cwl.sG)
            && !$$2.a(cwl.ff)
            && !$$2.a(cwl.fI)
            && !$$2.a(asb.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dja $$0) {
      return $$0.a(cwl.bs) || $$0.a(cwl.cw) || $$0.a(cwl.fI);
   }

   @Override
   public float a(cmr $$0, dja $$1) {
      if ($$1.a(cwl.bs) || $$1.a(asb.O)) {
         return 15.0F;
      } else if ($$1.a(asb.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cwl.ff) && !$$1.a(cwl.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if ($$3.b() instanceof czy $$5 && !$$5.o($$3)) {
         cfb $$6 = $$0.o();
         cmr $$7 = $$0.n();
         if ($$6 instanceof ana) {
            am.N.a((ana)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, arm.kL, arn.e, 1.0F, 1.0F);
         dja $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dnk.c, $$2, dnk.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bjv.a($$1.B);
      }

      return super.a($$0);
   }
}
