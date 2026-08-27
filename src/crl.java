public class crl extends cry {
   public crl(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      ckl $$1 = $$0.o();
      czu $$2 = $$0.q();
      im $$3 = $$0.a();
      dpy $$4 = $$2.a_($$3);
      if (!ddj.h($$4) && !ddk.g($$4) && !ddl.g($$4)) {
         im $$5 = $$3.a($$0.k());
         if (dci.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, auz.iU, ava.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dpy $$6 = dci.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dur.i, $$3);
            csd $$7 = $$0.n();
            if ($$1 instanceof aqf) {
               am.z.a((aqf)$$1, $$5, $$7);
               $$7.a(1, $$1, bre.d($$0.p()));
            }

            return boq.a($$2.x_());
         } else {
            return boq.e;
         }
      } else {
         $$2.a($$1, $$3, auz.iU, ava.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dqo.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dur.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bre.d($$0.p()));
         }

         return boq.a($$2.x_());
      }
   }
}
