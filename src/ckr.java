public class ckr extends clj {
   public ckr(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cvt.h($$3) && !cvu.g($$3) && !cvv.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cus.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cus.a($$1, $$2));
            $$1.a($$0.o(), dlx.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(did.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dlx.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bjb.a($$1.B);
      } else {
         return bjb.e;
      }
   }

   private void a(csf $$0, hx $$1) {
      atw $$2 = $$0.F_();
      $$0.a(null, $$1, aqv.hX, aqw.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
