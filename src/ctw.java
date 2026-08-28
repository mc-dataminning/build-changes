public class ctw extends cuj {
   public ctw(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      cmw $$1 = $$0.o();
      dbx $$2 = $$0.q();
      iz $$3 = $$0.a();
      dsb $$4 = $$2.a_($$3);
      if (!dfm.h($$4) && !dfn.g($$4) && !dfo.g($$4)) {
         iz $$5 = $$3.a($$0.k());
         if (del.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avz.iZ, awa.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsb $$6 = del.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dwu.i, $$3);
            cuo $$7 = $$0.n();
            if ($$1 instanceof arf) {
               am.z.a((arf)$$1, $$5, $$7);
               $$7.a(1, $$1, bto.d($$0.p()));
            }

            return bqt.a($$2.x_());
         } else {
            return bqt.f;
         }
      } else {
         $$2.a($$1, $$3, avz.iZ, awa.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dsr.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dwu.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bto.d($$0.p()));
         }

         return bqt.a($$2.x_());
      }
   }
}
