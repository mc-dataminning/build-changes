public class cxv extends cxd {
   private final bvi<? extends crq> a;

   public cxv(bvi<? extends crq> $$0, cxd.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      if (!$$3.a(awp.P)) {
         return bsy.d;
      } else {
         cxh $$4 = $$0.n();
         dyu $$5 = $$3.b() instanceof djt ? $$3.c(((djt)$$3.b()).c()) : dyu.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fbx $$7 = new fbx((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         crq $$8 = crq.a($$1, $$7.d, $$7.e, $$7.f, this.a, bvh.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsy.d;
         } else {
            if (crq.b($$1)) {
               for (bva $$10 : $$1.a_(null, $$8.cQ())) {
                  if ($$10 instanceof crq) {
                     return bsy.d;
                  }
               }
            }

            if ($$1 instanceof ard $$11) {
               $$11.b($$8);
               $$11.a(ecp.t, $$2, ecp.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsy.a;
         }
      }
   }
}
