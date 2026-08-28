public class cvb extends cvn {
   public cvb(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      cnx $$1 = $$0.o();
      dej $$2 = $$0.q();
      jf $$3 = $$0.a();
      dus $$4 = $$2.a_($$3);
      if (!dia.i($$4) && !dib.h($$4) && !dic.h($$4)) {
         jf $$5 = $$3.a($$0.k());
         if (dgz.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awg.ja, awh.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
            dus $$6 = dgz.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dzp.i, $$3);
            cvs $$7 = $$0.n();
            if ($$1 instanceof ark) {
               an.z.a((ark)$$1, $$5, $$7);
               $$7.a(1, $$1, bun.d($$0.p()));
            }

            return brs.a;
         } else {
            return brs.d;
         }
      } else {
         $$2.a($$1, $$3, awg.ja, awh.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dvi.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dzp.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bun.d($$0.p()));
         }

         return brs.a;
      }
   }
}
