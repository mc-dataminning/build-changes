public class cyc extends cyo {
   public cyc(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      cqs $$1 = $$0.o();
      dip $$2 = $$0.q();
      iu $$3 = $$0.a();
      dzo $$4 = $$2.a_($$3);
      if (!dmj.i($$4) && !dmk.h($$4) && !dml.h($$4)) {
         iu $$5 = $$3.a($$0.k());
         if (dlh.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awl.jz, awm.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            dzo $$6 = dlh.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eeo.i, $$3);
            cys $$7 = $$0.n();
            if ($$1 instanceof arp) {
               ap.z.a((arp)$$1, $$5, $$7);
               $$7.a(1, $$1, bwz.d($$0.p()));
            }

            return bty.a;
         } else {
            return bty.d;
         }
      } else {
         $$2.a($$1, $$3, awl.jz, awm.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(eae.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, eeo.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bwz.d($$0.p()));
         }

         return bty.a;
      }
   }
}
