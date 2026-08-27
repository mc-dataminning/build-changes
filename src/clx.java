public class clx extends ckw {
   public clx(ckw.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(clb $$0, crs $$1, dgw $$2, ht $$3, bky $$4) {
      if (!$$1.B && !$$2.a(arc.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bkn.a));
      }

      return !$$2.a(arc.O)
            && !$$2.a(cuv.bs)
            && !$$2.a(cuv.bt)
            && !$$2.a(cuv.bu)
            && !$$2.a(cuv.bv)
            && !$$2.a(cuv.rF)
            && !$$2.a(cuv.ff)
            && !$$2.a(cuv.fI)
            && !$$2.a(arc.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dgw $$0) {
      return $$0.a(cuv.bs) || $$0.a(cuv.cw) || $$0.a(cuv.fI);
   }

   @Override
   public float a(clb $$0, dgw $$1) {
      if ($$1.a(cuv.bs) || $$1.a(arc.O)) {
         return 15.0F;
      } else if ($$1.a(arc.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cuv.ff) && !$$1.a(cuv.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cyi $$5 && !$$5.o($$3)) {
         cdm $$6 = $$0.o();
         clb $$7 = $$0.n();
         if ($$6 instanceof amb) {
            al.M.a((amb)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, aqn.km, aqo.e, 1.0F, 1.0F);
         dgw $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dlg.c, $$2, dlg.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return biq.a($$1.B);
      }

      return super.a($$0);
   }
}
