public class crh extends cry {
   public crh(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!ddj.h($$3) && !ddk.g($$3) && !ddl.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dci.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dci.a($$1, $$2));
            $$1.a($$0.o(), dur.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dqo.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dur.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().g(1);
         return boq.a($$1.B);
      } else {
         return boq.e;
      }
   }

   private void a(czu $$0, im $$1) {
      ayd $$2 = $$0.E_();
      $$0.a(null, $$1, auz.iF, ava.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
