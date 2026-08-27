public class cri extends cqh {
   public cri(cqh.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cqm $$0, cxb $$1, dnb $$2, ib $$3, bpp $$4) {
      if (!$$1.B && !$$2.a(aun.aK)) {
         $$0.a(1, $$4, bpe.a);
      }

      return !$$2.a(aun.O)
            && !$$2.a(dae.bs)
            && !$$2.a(dae.bt)
            && !$$2.a(dae.bu)
            && !$$2.a(dae.bv)
            && !$$2.a(dae.sG)
            && !$$2.a(dae.ff)
            && !$$2.a(dae.fI)
            && !$$2.a(aun.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dnb $$0) {
      return $$0.a(dae.bs) || $$0.a(dae.cw) || $$0.a(dae.fI);
   }

   @Override
   public float a(cqm $$0, dnb $$1) {
      if ($$1.a(dae.bs) || $$1.a(aun.O)) {
         return 15.0F;
      } else if ($$1.a(aun.a)) {
         return 5.0F;
      } else {
         return !$$1.a(dae.ff) && !$$1.a(dae.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof ddr $$5 && !$$5.o($$3)) {
         ciu $$6 = $$0.o();
         cqm $$7 = $$0.n();
         if ($$6 instanceof apg) {
            am.N.a((apg)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aty.li, atz.e, 1.0F, 1.0F);
         dnb $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(drp.c, $$2, drp.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bpp.d($$0.p()));
         }

         return bnd.a($$1.B);
      }

      return super.a($$0);
   }
}
