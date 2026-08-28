public class cyx extends czj {
   public cyx(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      crm $$1 = $$0.o();
      djm $$2 = $$0.q();
      iv $$3 = $$0.a();
      eat $$4 = $$2.a_($$3);
      if (!dnh.i($$4) && !dni.h($$4) && !dnj.h($$4)) {
         iv $$5 = $$3.a($$0.k());
         if (dme.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awn.jD, awo.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            eat $$6 = dme.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eft.i, $$3);
            czn $$7 = $$0.n();
            if ($$1 instanceof arr) {
               aq.z.a((arr)$$1, $$5, $$7);
               $$7.a(1, $$1, bxj.d($$0.p()));
            }

            return bug.a;
         } else {
            return bug.d;
         }
      } else {
         $$2.a($$1, $$3, awn.jD, awo.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(ebj.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, eft.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bxj.d($$0.p()));
         }

         return bug.a;
      }
   }
}
