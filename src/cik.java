public class cik extends cjc {
   public cik(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!ctk.h($$3) && !ctl.g($$3) && !ctm.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (csl.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, csl.a($$1, $$2));
            $$1.a($$0.o(), djv.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dgb.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), djv.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bha.a($$1.B);
      } else {
         return bha.e;
      }
   }

   private void a(cpx $$0, gw $$1) {
      ase $$2 = $$0.D_();
      $$0.a(null, $$1, apf.hD, apg.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
