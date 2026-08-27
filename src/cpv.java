public class cpv extends cou {
   public cpv(cou.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(coz $$0, cvn $$1, dlf $$2, hz $$3, bog $$4) {
      if (!$$1.B && !$$2.a(atz.aJ)) {
         $$0.a(1, $$4, bnv.a);
      }

      return !$$2.a(atz.O)
            && !$$2.a(cyq.bs)
            && !$$2.a(cyq.bt)
            && !$$2.a(cyq.bu)
            && !$$2.a(cyq.bv)
            && !$$2.a(cyq.sG)
            && !$$2.a(cyq.ff)
            && !$$2.a(cyq.fI)
            && !$$2.a(atz.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dlf $$0) {
      return $$0.a(cyq.bs) || $$0.a(cyq.cw) || $$0.a(cyq.fI);
   }

   @Override
   public float a(coz $$0, dlf $$1) {
      if ($$1.a(cyq.bs) || $$1.a(atz.O)) {
         return 15.0F;
      } else if ($$1.a(atz.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cyq.ff) && !$$1.a(cyq.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dcd $$5 && !$$5.o($$3)) {
         chh $$6 = $$0.o();
         coz $$7 = $$0.n();
         if ($$6 instanceof aow) {
            am.N.a((aow)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, atk.la, atl.e, 1.0F, 1.0F);
         dlf $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dpp.c, $$2, dpp.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bog.d($$0.p()));
         }

         return blu.a($$1.B);
      }

      return super.a($$0);
   }
}
