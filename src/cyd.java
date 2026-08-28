public class cyd extends cxl {
   private final bvr<? extends crw> a;

   public cyd(bvr<? extends crw> $$0, cxl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      if (!$$3.a(axu.P)) {
         return btj.d;
      } else {
         cxp $$4 = $$0.n();
         dyy $$5 = $$3.b() instanceof dkb ? $$3.c(((dkb)$$3.b()).c()) : dyy.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fby $$7 = new fby((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         crw $$8 = crw.a($$1, $$7.d, $$7.e, $$7.f, this.a, bvq.o, $$4, $$0.o());
         if ($$8 == null) {
            return btj.d;
         } else {
            if (crw.b($$1)) {
               for (bvk $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof crw) {
                     return btj.d;
                  }
               }
            }

            if ($$1 instanceof ash $$11) {
               $$11.b($$8);
               $$11.a(ecr.t, $$2, ecr.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return btj.a;
         }
      }
   }
}
