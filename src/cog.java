public class cog extends coy {
   public cog(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!czg.h($$3) && !czh.g($$3) && !czi.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cyf.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cyf.a($$1, $$2));
            $$1.a($$0.o(), dpw.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dlz.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dpw.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return blw.a($$1.B);
      } else {
         return blw.e;
      }
   }

   private void a(cvr $$0, hz $$1) {
      awp $$2 = $$0.F_();
      $$0.a(null, $$1, atl.iw, atm.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
