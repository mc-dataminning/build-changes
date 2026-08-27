public class clf extends cke {
   public clf(cke.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(ckj $$0, cqz $$1, dgb $$2, ht $$3, bkj $$4) {
      if (!$$1.B && !$$2.a(aqs.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bjy.a));
      }

      return !$$2.a(aqs.O)
            && !$$2.a(cuc.bs)
            && !$$2.a(cuc.bt)
            && !$$2.a(cuc.bu)
            && !$$2.a(cuc.bv)
            && !$$2.a(cuc.rF)
            && !$$2.a(cuc.ff)
            && !$$2.a(cuc.fI)
            && !$$2.a(aqs.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dgb $$0) {
      return $$0.a(cuc.bs) || $$0.a(cuc.cw) || $$0.a(cuc.fI);
   }

   @Override
   public float a(ckj $$0, dgb $$1) {
      if ($$1.a(cuc.bs) || $$1.a(aqs.O)) {
         return 15.0F;
      } else if ($$1.a(aqs.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cuc.ff) && !$$1.a(cuc.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cxo $$5 && !$$5.o($$3)) {
         ccx $$6 = $$0.o();
         ckj $$7 = $$0.n();
         if ($$6 instanceof alr) {
            al.M.a((alr)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aqd.kk, aqe.e, 1.0F, 1.0F);
         dgb $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dkl.c, $$2, dkl.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bib.a($$1.B);
      }

      return super.a($$0);
   }
}
