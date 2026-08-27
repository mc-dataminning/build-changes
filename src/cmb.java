public class cmb extends cmt {
   public cmb(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cxe.h($$3) && !cxf.g($$3) && !cxg.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cwd.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cwd.a($$1, $$2));
            $$1.a($$0.o(), dnr.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(djx.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dnr.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bkb.a($$1.B);
      } else {
         return bkb.e;
      }
   }

   private void a(ctp $$0, hx $$1) {
      auv $$2 = $$0.F_();
      $$0.a(null, $$1, ars.ig, art.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
