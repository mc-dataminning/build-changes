public class ctv extends cui {
   public ctv(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      cmv $$1 = $$0.o();
      dbw $$2 = $$0.q();
      iz $$3 = $$0.a();
      dsa $$4 = $$2.a_($$3);
      if (!dfl.h($$4) && !dfm.g($$4) && !dfn.g($$4)) {
         iz $$5 = $$3.a($$0.k());
         if (dek.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avz.iZ, awa.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsa $$6 = dek.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dwt.i, $$3);
            cun $$7 = $$0.n();
            if ($$1 instanceof arf) {
               am.z.a((arf)$$1, $$5, $$7);
               $$7.a(1, $$1, btn.d($$0.p()));
            }

            return bqs.a($$2.x_());
         } else {
            return bqs.f;
         }
      } else {
         $$2.a($$1, $$3, avz.iZ, awa.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dsq.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dwt.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btn.d($$0.p()));
         }

         return bqs.a($$2.x_());
      }
   }
}
