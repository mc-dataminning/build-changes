public class cyc extends cxk {
   private final bvq<? extends crv> a;

   public cyc(bvq<? extends crv> $$0, cxk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      if (!$$3.a(axu.P)) {
         return bti.d;
      } else {
         cxo $$4 = $$0.n();
         dyx $$5 = $$3.b() instanceof dka ? $$3.c(((dka)$$3.b()).c()) : dyx.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fbx $$7 = new fbx((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         crv $$8 = crv.a($$1, $$7.d, $$7.e, $$7.f, this.a, bvp.o, $$4, $$0.o());
         if ($$8 == null) {
            return bti.d;
         } else {
            if (crv.b($$1)) {
               for (bvj $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof crv) {
                     return bti.d;
                  }
               }
            }

            if ($$1 instanceof ash $$11) {
               $$11.b($$8);
               $$11.a(ecq.t, $$2, ecq.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bti.a;
         }
      }
   }
}
