public class cke extends ckw {
   public cke(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cvh.h($$3) && !cvi.g($$3) && !cvj.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cug.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cug.a($$1, $$2));
            $$1.a($$0.o(), dlg.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dhm.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dlg.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return biq.a($$1.B);
      } else {
         return biq.e;
      }
   }

   private void a(crs $$0, ht $$1) {
      ato $$2 = $$0.E_();
      $$0.a(null, $$1, aqn.hH, aqo.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
