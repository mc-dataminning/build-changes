public class csf extends cre {
   public csf(cre.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(crj $$0, cyx $$1, doz $$2, ib $$3, bqo $$4) {
      if (!$$1.B && !$$2.a(avc.aK)) {
         $$0.a(1, $$4, bqc.a);
      }

      return !$$2.a(avc.O)
            && !$$2.a(dca.bs)
            && !$$2.a(dca.bt)
            && !$$2.a(dca.bu)
            && !$$2.a(dca.bv)
            && !$$2.a(dca.sG)
            && !$$2.a(dca.ff)
            && !$$2.a(dca.fI)
            && !$$2.a(avc.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(doz $$0) {
      return $$0.a(dca.bs) || $$0.a(dca.cw) || $$0.a(dca.fI);
   }

   @Override
   public float a(crj $$0, doz $$1) {
      if ($$1.a(dca.bs) || $$1.a(avc.O)) {
         return 15.0F;
      } else if ($$1.a(avc.a)) {
         return 5.0F;
      } else {
         return !$$1.a(dca.ff) && !$$1.a(dca.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfn $$5 && !$$5.o($$3)) {
         cjt $$6 = $$0.o();
         crj $$7 = $$0.n();
         if ($$6 instanceof apt) {
            am.N.a((apt)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aum.lk, aun.e, 1.0F, 1.0F);
         doz $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dts.c, $$2, dts.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bqo.d($$0.p()));
         }

         return boa.a($$1.B);
      }

      return super.a($$0);
   }
}
