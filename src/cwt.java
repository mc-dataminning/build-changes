public class cwt extends cwb {
   private final bup<? extends cqo> a;

   public cwt(bup<? extends cqo> $$0, cwb.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      if (!$$3.a(axd.O)) {
         return bsh.d;
      } else {
         cwf $$4 = $$0.n();
         dwr $$5 = $$3.b() instanceof dhy ? $$3.c(((dhy)$$3.b()).c()) : dwr.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ezr $$7 = new ezr((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqo $$8 = cqo.a($$1, $$7.d, $$7.e, $$7.f, this.a, buo.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsh.d;
         } else {
            if (cqo.b($$1)) {
               for (bui $$10 : $$1.a_(null, $$8.cT())) {
                  if ($$10 instanceof cqo) {
                     return bsh.d;
                  }
               }
            }

            if ($$1 instanceof arq $$11) {
               $$11.b($$8);
               $$11.a(eak.t, $$2, eak.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsh.a;
         }
      }
   }
}
