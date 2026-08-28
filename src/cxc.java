public class cxc extends cwk {
   private final bur<? extends cqv> a;

   public cxc(bur<? extends cqv> $$0, cwk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      if (!$$3.a(awp.P)) {
         return bsj.d;
      } else {
         cwo $$4 = $$0.n();
         dxz $$5 = $$3.b() instanceof dja ? $$3.c(((dja)$$3.b()).c()) : dxz.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         faz $$7 = new faz((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqv $$8 = cqv.a($$1, $$7.d, $$7.e, $$7.f, this.a, buq.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsj.d;
         } else {
            if (cqv.b($$1)) {
               for (buk $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cqv) {
                     return bsj.d;
                  }
               }
            }

            if ($$1 instanceof ard $$11) {
               $$11.b($$8);
               $$11.a(ebs.t, $$2, ebs.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsj.a;
         }
      }
   }
}
