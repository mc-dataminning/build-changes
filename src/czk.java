public class czk extends czw {
   public czk(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      crz $$1 = $$0.o();
      djz $$2 = $$0.q();
      iw $$3 = $$0.a();
      ebg $$4 = $$2.a_($$3);
      if (!dnu.i($$4) && !dnv.h($$4) && !dnw.h($$4)) {
         iw $$5 = $$3.a($$0.k());
         if (dmr.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awr.jD, aws.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
            ebg $$6 = dmr.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, egg.i, $$3);
            daa $$7 = $$0.n();
            if ($$1 instanceof arv) {
               aq.z.a((arv)$$1, $$5, $$7);
               $$7.a(1, $$1, bxw.d($$0.p()));
            }

            return but.a;
         } else {
            return but.d;
         }
      } else {
         $$2.a($$1, $$3, awr.jD, aws.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(ebw.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, egg.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bxw.d($$0.p()));
         }

         return but.a;
      }
   }
}
