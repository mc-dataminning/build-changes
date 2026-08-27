public class cjw extends civ {
   public cjw(civ.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cja $$0, cpq $$1, dfe $$2, gw $$3, bjb $$4) {
      if (!$$1.B && !$$2.a(apo.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(biq.a));
      }

      return !$$2.a(apo.O)
            && !$$2.a(csr.bs)
            && !$$2.a(csr.bt)
            && !$$2.a(csr.bu)
            && !$$2.a(csr.bv)
            && !$$2.a(csr.rF)
            && !$$2.a(csr.ff)
            && !$$2.a(csr.fI)
            && !$$2.a(apo.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dfe $$0) {
      return $$0.a(csr.bs) || $$0.a(csr.cw) || $$0.a(csr.fI);
   }

   @Override
   public float a(cja $$0, dfe $$1) {
      if ($$1.a(csr.bs) || $$1.a(apo.O)) {
         return 15.0F;
      } else if ($$1.a(apo.a)) {
         return 5.0F;
      } else {
         return !$$1.a(csr.ff) && !$$1.a(csr.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cwd $$5 && !$$5.o($$3)) {
         cbp $$6 = $$0.o();
         cja $$7 = $$0.n();
         if ($$6 instanceof ako) {
            al.M.a((ako)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aoz.ki, apa.e, 1.0F, 1.0F);
         dfe $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(djo.c, $$2, djo.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bgt.a($$1.B);
      }

      return super.a($$0);
   }
}
