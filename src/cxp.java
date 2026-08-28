import javax.annotation.Nullable;

public class cxp extends cuw {
   public cxp(djn $$0, cwm.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public dah b(dah $$0) {
      ji $$1 = $$0.a();
      dgj $$2 = $$0.q();
      dwy $$3 = $$2.a_($$1);
      djn $$4 = this.d();
      if (!$$3.a($$4)) {
         return dqh.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jn $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jn.b ? $$0.g() : jn.b;
         }

         int $$7 = 0;
         ji.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               coy $$9 = $$0.o();
               int $$10 = $$2.an();
               if ($$9 instanceof are && $$8.v() > $$10) {
                  ((are)$$9).b(wp.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return dah.a($$0, $$8, $$5);
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
