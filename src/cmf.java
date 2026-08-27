public class cmf extends cle {
   public cmf(cle.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(clj $$0, csa $$1, dhi $$2, ht $$3, blg $$4) {
      if (!$$1.B && !$$2.a(arg.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bkv.a));
      }

      return !$$2.a(arg.O)
            && !$$2.a(cvc.bs)
            && !$$2.a(cvc.bt)
            && !$$2.a(cvc.bu)
            && !$$2.a(cvc.bv)
            && !$$2.a(cvc.sG)
            && !$$2.a(cvc.ff)
            && !$$2.a(cvc.fI)
            && !$$2.a(arg.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dhi $$0) {
      return $$0.a(cvc.bs) || $$0.a(cvc.cw) || $$0.a(cvc.fI);
   }

   @Override
   public float a(clj $$0, dhi $$1) {
      if ($$1.a(cvc.bs) || $$1.a(arg.O)) {
         return 15.0F;
      } else if ($$1.a(arg.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cvc.ff) && !$$1.a(cvc.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cyp $$5 && !$$5.o($$3)) {
         cdu $$6 = $$0.o();
         clj $$7 = $$0.n();
         if ($$6 instanceof amf) {
            al.M.a((amf)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aqr.kC, aqs.e, 1.0F, 1.0F);
         dhi $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dls.c, $$2, dls.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bix.a($$1.B);
      }

      return super.a($$0);
   }
}
