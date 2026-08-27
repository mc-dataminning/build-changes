public class ctj extends cuc {
   public ctj(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfq.h($$3) && !dfr.g($$3) && !dfs.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (deo.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, deo.a($$1, $$2));
            $$1.a($$0.o(), dxv.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dts.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dxv.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqa.a($$1.C);
      } else {
         return bqa.e;
      }
   }

   private void a(dca $$0, ir $$1) {
      ayt $$2 = $$0.F_();
      $$0.a(null, $$1, avo.iX, avq.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
