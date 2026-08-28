import javax.annotation.Nullable;

public class cwo extends ctr {
   public cwo(dhj $$0, cvk.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public czk b(czk $$0) {
      je $$1 = $$0.a();
      deg $$2 = $$0.q();
      duo $$3 = $$2.a_($$1);
      dhj $$4 = this.d();
      if (!$$3.a($$4)) {
         return dnz.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jj $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jj.b ? $$0.g() : jj.b;
         }

         int $$7 = 0;
         je.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cnu $$9 = $$0.o();
               int $$10 = $$2.an();
               if ($$9 instanceof ari && $$8.v() > $$10) {
                  ((ari)$$9).b(xd.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return czk.a($$0, $$8, $$5);
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
