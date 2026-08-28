public class cym extends cxu {
   private final bwb<? extends csh> a;

   public cym(bwb<? extends csh> $$0, cxu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      if (!$$3.a(awz.P)) {
         return btq.d;
      } else {
         cxy $$4 = $$0.n();
         dzq $$5 = $$3.b() instanceof dkj ? $$3.c(((dkj)$$3.b()).c()) : dzq.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fcu $$7 = new fcu((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         csh $$8 = csh.a($$1, $$7.d, $$7.e, $$7.f, this.a, bwa.o, $$4, $$0.o());
         if ($$8 == null) {
            return btq.d;
         } else {
            if (csh.b($$1)) {
               for (bvs $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof csh) {
                     return btq.d;
                  }
               }
            }

            if ($$1 instanceof arn $$11) {
               $$11.b($$8);
               $$11.a(edm.t, $$2, edm.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return btq.a;
         }
      }
   }
}
