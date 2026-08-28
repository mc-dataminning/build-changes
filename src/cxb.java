public class cxb extends cwj {
   private final buq<? extends cqu> a;

   public cxb(buq<? extends cqu> $$0, cwj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      if (!$$3.a(awo.P)) {
         return bsi.d;
      } else {
         cwn $$4 = $$0.n();
         dxy $$5 = $$3.b() instanceof diz ? $$3.c(((diz)$$3.b()).c()) : dxy.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fay $$7 = new fay((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqu $$8 = cqu.a($$1, $$7.d, $$7.e, $$7.f, this.a, bup.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsi.d;
         } else {
            if (cqu.b($$1)) {
               for (buj $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cqu) {
                     return bsi.d;
                  }
               }
            }

            if ($$1 instanceof arc $$11) {
               $$11.b($$8);
               $$11.a(ebr.t, $$2, ebr.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsi.a;
         }
      }
   }
}
