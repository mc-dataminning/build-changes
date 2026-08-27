public class cra extends crn {
   public cra(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      cka $$1 = $$0.o();
      czg $$2 = $$0.q();
      id $$3 = $$0.a();
      dpi $$4 = $$2.a_($$3);
      if (!dcv.h($$4) && !dcw.g($$4) && !dcx.g($$4)) {
         id $$5 = $$3.a($$0.k());
         if (dbu.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, auo.iU, aup.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dpi $$6 = dbu.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dub.i, $$3);
            crs $$7 = $$0.n();
            if ($$1 instanceof apv) {
               am.z.a((apv)$$1, $$5, $$7);
               $$7.a(1, $$1, bqt.d($$0.p()));
            }

            return bof.a($$2.x_());
         } else {
            return bof.e;
         }
      } else {
         $$2.a($$1, $$3, auo.iU, aup.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dpy.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dub.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bqt.d($$0.p()));
         }

         return bof.a($$2.x_());
      }
   }
}
