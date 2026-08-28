public class cxu extends cxc {
   private final bvi<? extends crn> a;

   public cxu(bvi<? extends crn> $$0, cxc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      if (!$$3.a(axk.P)) {
         return bta.d;
      } else {
         cxg $$4 = $$0.n();
         dyr $$5 = $$3.b() instanceof djs ? $$3.c(((djs)$$3.b()).c()) : dyr.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fbr $$7 = new fbr((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         crn $$8 = crn.a($$1, $$7.d, $$7.e, $$7.f, this.a, bvh.o, $$4, $$0.o());
         if ($$8 == null) {
            return bta.d;
         } else {
            if (crn.b($$1)) {
               for (bvb $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof crn) {
                     return bta.d;
                  }
               }
            }

            if ($$1 instanceof arx $$11) {
               $$11.b($$8);
               $$11.a(eck.t, $$2, eck.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bta.a;
         }
      }
   }
}
