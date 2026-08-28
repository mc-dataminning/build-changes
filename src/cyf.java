import javax.annotation.Nullable;

public class cyf extends cvm {
   public cyf(dkd $$0, cxc.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public dax b(dax $$0) {
      jh $$1 = $$0.a();
      dgz $$2 = $$0.q();
      dxo $$3 = $$2.a_($$1);
      dkd $$4 = this.d();
      if (!$$3.a($$4)) {
         return dqx.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jm $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jm.b ? $$0.g() : jm.b;
         }

         int $$7 = 0;
         jh.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               cpo $$9 = $$0.o();
               int $$10 = $$2.an();
               if ($$9 instanceof ary && $$8.v() > $$10) {
                  ((ary)$$9).b(xk.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return dax.a($$0, $$8, $$5);
               }
               break;
            }

            $$8.c($$5);
            if ($$5.o().d()) {
               $$7++;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean c() {
      return false;
   }
}
