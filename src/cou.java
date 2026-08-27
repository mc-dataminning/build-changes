public class cou extends cpl {
   public cou(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!czt.h($$3) && !czu.g($$3) && !czv.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cys.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cys.a($$1, $$2));
            $$1.a($$0.o(), dqr.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dmu.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dqr.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bml.a($$1.B);
      } else {
         return bml.e;
      }
   }

   private void a(cwe $$0, ib $$1) {
      awt $$2 = $$0.F_();
      $$0.a(null, $$1, atp.iw, atq.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
