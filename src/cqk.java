import javax.annotation.Nullable;

public class cqk extends cnl {
   public cqk(czf $$0, cpl.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public crx b(crx $$0) {
      ib $$1 = $$0.a();
      cwe $$2 = $$0.q();
      dme $$3 = $$2.a_($$1);
      czf $$4 = this.d();
      if (!$$3.a($$4)) {
         return dft.a($$2, $$1) == 7 ? null : $$0;
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
               cia $$9 = $$0.o();
               int $$10 = $$2.ak();
               if ($$9 instanceof apb && $$8.v() >= $$10) {
                  ((apb)$$9).b(vs.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return crx.a($$0, $$8, $$5);
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
