public class cts extends cuf {
   public cts(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      cms $$1 = $$0.o();
      dbt $$2 = $$0.q();
      iz $$3 = $$0.a();
      drx $$4 = $$2.a_($$3);
      if (!dfi.h($$4) && !dfj.g($$4) && !dfk.g($$4)) {
         iz $$5 = $$3.a($$0.k());
         if (deh.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avw.iZ, avx.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            drx $$6 = deh.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dwq.i, $$3);
            cuk $$7 = $$0.n();
            if ($$1 instanceof arc) {
               am.z.a((arc)$$1, $$5, $$7);
               $$7.a(1, $$1, btk.d($$0.p()));
            }

            return bqp.a($$2.x_());
         } else {
            return bqp.f;
         }
      } else {
         $$2.a($$1, $$3, avw.iZ, avx.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dsn.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dwq.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btk.d($$0.p()));
         }

         return bqp.a($$2.x_());
      }
   }
}
