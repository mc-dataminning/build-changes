public class cmk extends clj {
   public cmk(clj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(clo $$0, csf $$1, dhn $$2, hx $$3, bll $$4) {
      if (!$$1.B && !$$2.a(ark.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bla.a));
      }

      return !$$2.a(ark.O)
            && !$$2.a(cvh.bs)
            && !$$2.a(cvh.bt)
            && !$$2.a(cvh.bu)
            && !$$2.a(cvh.bv)
            && !$$2.a(cvh.sG)
            && !$$2.a(cvh.ff)
            && !$$2.a(cvh.fI)
            && !$$2.a(ark.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dhn $$0) {
      return $$0.a(cvh.bs) || $$0.a(cvh.cw) || $$0.a(cvh.fI);
   }

   @Override
   public float a(clo $$0, dhn $$1) {
      if ($$1.a(cvh.bs) || $$1.a(ark.O)) {
         return 15.0F;
      } else if ($$1.a(ark.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cvh.ff) && !$$1.a(cvh.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cyu $$5 && !$$5.o($$3)) {
         cdz $$6 = $$0.o();
         clo $$7 = $$0.n();
         if ($$6 instanceof amj) {
            al.M.a((amj)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aqv.kC, aqw.e, 1.0F, 1.0F);
         dhn $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dlx.c, $$2, dlx.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bjb.a($$1.B);
      }

      return super.a($$0);
   }
}
