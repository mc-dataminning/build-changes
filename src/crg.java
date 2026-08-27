import javax.annotation.Nullable;

public class crg extends coh {
   public crg(dac $$0, cqh.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public csu b(csu $$0) {
      ib $$1 = $$0.a();
      cxb $$2 = $$0.q();
      dnb $$3 = $$2.a_($$1);
      dac $$4 = this.d();
      if (!$$3.a($$4)) {
         return dgq.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ih $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ih.b ? $$0.g() : ih.b;
         }

         int $$7 = 0;
         ib.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               ciu $$9 = $$0.o();
               int $$10 = $$2.ak();
               if ($$9 instanceof apg && $$8.v() >= $$10) {
                  ((apg)$$9).b(vu.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return csu.a($$0, $$8, $$5);
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
