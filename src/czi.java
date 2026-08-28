public class czi extends czu {
   public czi(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      crx $$1 = $$0.o();
      djx $$2 = $$0.q();
      iv $$3 = $$0.a();
      ebe $$4 = $$2.a_($$3);
      if (!dns.i($$4) && !dnt.h($$4) && !dnu.h($$4)) {
         iv $$5 = $$3.a($$0.k());
         if (dmp.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awp.jD, awq.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
            ebe $$6 = dmp.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ege.i, $$3);
            czy $$7 = $$0.n();
            if ($$1 instanceof art) {
               aq.z.a((art)$$1, $$5, $$7);
               $$7.a(1, $$1, bxu.d($$0.p()));
            }

            return bur.a;
         } else {
            return bur.d;
         }
      } else {
         $$2.a($$1, $$3, awp.jD, awq.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(ebu.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, ege.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bxu.d($$0.p()));
         }

         return bur.a;
      }
   }
}
