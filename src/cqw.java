public class cqw extends crn {
   public cqw(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dcv.h($$3) && !dcw.g($$3) && !dcx.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dbu.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dbu.a($$1, $$2));
            $$1.a($$0.o(), dub.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dpy.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dub.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().g(1);
         return bof.a($$1.B);
      } else {
         return bof.e;
      }
   }

   private void a(czg $$0, id $$1) {
      axt $$2 = $$0.E_();
      $$0.a(null, $$1, auo.iF, aup.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
