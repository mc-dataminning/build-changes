public class ckm extends cle {
   public ckm(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cvo.h($$3) && !cvp.g($$3) && !cvq.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cun.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cun.a($$1, $$2));
            $$1.a($$0.o(), dls.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dhy.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dls.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bix.a($$1.B);
      } else {
         return bix.e;
      }
   }

   private void a(csa $$0, ht $$1) {
      ats $$2 = $$0.E_();
      $$0.a(null, $$1, aqr.hX, aqs.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
