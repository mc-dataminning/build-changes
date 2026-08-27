public class coc extends cnb {
   public coc(cnb.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cng $$0, ctx $$1, djp $$2, hx $$3, bmo $$4) {
      if (!$$1.B && !$$2.a(asi.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bmd.a));
      }

      return !$$2.a(asi.O)
            && !$$2.a(cxa.bs)
            && !$$2.a(cxa.bt)
            && !$$2.a(cxa.bu)
            && !$$2.a(cxa.bv)
            && !$$2.a(cxa.sG)
            && !$$2.a(cxa.ff)
            && !$$2.a(cxa.fI)
            && !$$2.a(asi.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(djp $$0) {
      return $$0.a(cxa.bs) || $$0.a(cxa.cw) || $$0.a(cxa.fI);
   }

   @Override
   public float a(cng $$0, djp $$1) {
      if ($$1.a(cxa.bs) || $$1.a(asi.O)) {
         return 15.0F;
      } else if ($$1.a(asi.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cxa.ff) && !$$1.a(cxa.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dan $$5 && !$$5.o($$3)) {
         cfq $$6 = $$0.o();
         cng $$7 = $$0.n();
         if ($$6 instanceof anf) {
            am.N.a((anf)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, art.la, aru.e, 1.0F, 1.0F);
         djp $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dnz.c, $$2, dnz.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bkc.a($$1.B);
      }

      return super.a($$0);
   }
}
