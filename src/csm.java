import javax.annotation.Nullable;

public class csm extends cpq {
   public csm(dch $$0, crn.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cux b(cux $$0) {
      id $$1 = $$0.a();
      czg $$2 = $$0.q();
      dpi $$3 = $$2.a_($$1);
      dch $$4 = this.d();
      if (!$$3.a($$4)) {
         return div.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ij $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ij.b ? $$0.g() : ij.b;
         }

         int $$7 = 0;
         id.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cka $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof apv && $$8.v() >= $$10) {
                  ((apv)$$9).b(wi.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cux.a($$0, $$8, $$5);
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
