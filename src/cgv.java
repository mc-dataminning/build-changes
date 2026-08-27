public class cgv extends cfu {
   public cgv(cfu.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cfz $$0, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
      if (!$$1.B && !$$2.a(amw.aI)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bfo.a));
      }

      return !$$2.a(amw.O)
            && !$$2.a(cpo.bs)
            && !$$2.a(cpo.bt)
            && !$$2.a(cpo.bu)
            && !$$2.a(cpo.bv)
            && !$$2.a(cpo.rF)
            && !$$2.a(cpo.ff)
            && !$$2.a(cpo.fI)
            && !$$2.a(amw.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dcb $$0) {
      return $$0.a(cpo.bs) || $$0.a(cpo.cw) || $$0.a(cpo.fI);
   }

   @Override
   public float a(cfz $$0, dcb $$1) {
      if ($$1.a(cpo.bs) || $$1.a(amw.O)) {
         return 15.0F;
      } else if ($$1.a(amw.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cpo.ff) && !$$1.a(cpo.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cta $$5 && !$$5.o($$3)) {
         byo $$6 = $$0.o();
         cfz $$7 = $$0.n();
         if ($$6 instanceof aig) {
            ai.M.a((aig)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, amh.ki, ami.e, 1.0F, 1.0F);
         dcb $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dgl.c, $$2, dgl.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bdx.a($$1.B);
      }

      return super.a($$0);
   }
}
