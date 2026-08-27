public class cnu extends cmt {
   public cnu(cmt.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cmy $$0, ctp $$1, djh $$2, hx $$3, bml $$4) {
      if (!$$1.B && !$$2.a(ash.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bma.a));
      }

      return !$$2.a(ash.O)
            && !$$2.a(cws.bs)
            && !$$2.a(cws.bt)
            && !$$2.a(cws.bu)
            && !$$2.a(cws.bv)
            && !$$2.a(cws.sG)
            && !$$2.a(cws.ff)
            && !$$2.a(cws.fI)
            && !$$2.a(ash.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(djh $$0) {
      return $$0.a(cws.bs) || $$0.a(cws.cw) || $$0.a(cws.fI);
   }

   @Override
   public float a(cmy $$0, djh $$1) {
      if ($$1.a(cws.bs) || $$1.a(ash.O)) {
         return 15.0F;
      } else if ($$1.a(ash.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cws.ff) && !$$1.a(cws.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if ($$3.b() instanceof daf $$5 && !$$5.o($$3)) {
         cfi $$6 = $$0.o();
         cmy $$7 = $$0.n();
         if ($$6 instanceof ane) {
            am.N.a((ane)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, ars.kL, art.e, 1.0F, 1.0F);
         djh $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dnr.c, $$2, dnr.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bkb.a($$1.B);
      }

      return super.a($$0);
   }
}
