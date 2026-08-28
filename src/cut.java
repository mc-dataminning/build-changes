public class cut extends cvg {
   public cut(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      cnp $$1 = $$0.o();
      dds $$2 = $$0.q();
      je $$3 = $$0.a();
      dua $$4 = $$2.a_($$3);
      if (!dhj.i($$4) && !dhk.h($$4) && !dhl.h($$4)) {
         je $$5 = $$3.a($$0.k());
         if (dgi.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awd.ja, awe.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            dua $$6 = dgi.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dyx.i, $$3);
            cvl $$7 = $$0.n();
            if ($$1 instanceof arh) {
               an.z.a((arh)$$1, $$5, $$7);
               $$7.a(1, $$1, buf.d($$0.p()));
            }

            return brk.a;
         } else {
            return brk.d;
         }
      } else {
         $$2.a($$1, $$3, awd.ja, awe.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(duq.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dyx.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, buf.d($$0.p()));
         }

         return brk.a;
      }
   }
}
