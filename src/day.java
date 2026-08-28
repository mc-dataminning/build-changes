public class day extends dag {
   private final bxn<? extends cuv> a;

   public day(bxn<? extends cuv> $$0, dag.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      if (!$$3.a(axn.P)) {
         return bvc.d;
      } else {
         dak $$4 = $$0.n();
         ecu $$5 = $$3.b() instanceof dnd ? $$3.c(((dnd)$$3.b()).c()) : ecu.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fgc $$7 = new fgc((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cuv $$8 = cuv.a($$1, $$7.d, $$7.e, $$7.f, this.a, bxm.o, $$4, $$0.o());
         if ($$8 == null) {
            return bvc.d;
         } else {
            if (cuv.b($$1)) {
               for (bxe $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cuv) {
                     return bvc.d;
                  }
               }
            }

            if ($$1 instanceof asb $$11) {
               $$11.b($$8);
               $$11.a(egq.t, $$2, egq.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bvc.a;
         }
      }
   }
}
