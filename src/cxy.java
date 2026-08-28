public class cxy extends cxg {
   private final bvm<? extends crr> a;

   public cxy(bvm<? extends crr> $$0, cxg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      if (!$$3.a(axu.P)) {
         return bte.d;
      } else {
         cxk $$4 = $$0.n();
         dyq $$5 = $$3.b() instanceof djt ? $$3.c(((djt)$$3.b()).c()) : dyq.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fbs $$7 = new fbs((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         crr $$8 = crr.a($$1, $$7.d, $$7.e, $$7.f, this.a, bvl.o, $$4, $$0.o());
         if ($$8 == null) {
            return bte.d;
         } else {
            if (crr.b($$1)) {
               for (bvf $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof crr) {
                     return bte.d;
                  }
               }
            }

            if ($$1 instanceof ash $$11) {
               $$11.b($$8);
               $$11.a(ecj.t, $$2, ecj.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bte.a;
         }
      }
   }
}
