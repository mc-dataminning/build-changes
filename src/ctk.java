public class ctk extends ctx {
   public ctk(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      cmk $$1 = $$0.o();
      dcf $$2 = $$0.q();
      ja $$3 = $$0.a();
      dsk $$4 = $$2.a_($$3);
      if (!dfv.h($$4) && !dfw.g($$4) && !dfx.g($$4)) {
         ja $$5 = $$3.a($$0.k());
         if (deu.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avh.iZ, avi.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsk $$6 = deu.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dxg.i, $$3);
            cuc $$7 = $$0.n();
            if ($$1 instanceof aqn) {
               am.z.a((aqn)$$1, $$5, $$7);
               $$7.a(1, $$1, btb.d($$0.p()));
            }

            return bqg.a($$2.x_());
         } else {
            return bqg.f;
         }
      } else {
         $$2.a($$1, $$3, avh.iZ, avi.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dta.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dxg.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btb.d($$0.p()));
         }

         return bqg.a($$2.x_());
      }
   }
}
