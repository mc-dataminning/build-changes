import javax.annotation.Nullable;

public class cvm extends csn {
   public cvm(dez $$0, cuk.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cya b(cya $$0) {
      iz $$1 = $$0.a();
      dby $$2 = $$0.q();
      dsc $$3 = $$2.a_($$1);
      dez $$4 = this.d();
      if (!$$3.a($$4)) {
         return dlo.a($$2, $$1) == 7 ? null : $$0;
      } else {
         je $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == je.b ? $$0.g() : je.b;
         }

         int $$7 = 0;
         iz.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cmx $$9 = $$0.o();
               int $$10 = $$2.am();
               if ($$9 instanceof arg && $$8.v() >= $$10) {
                  ((arg)$$9).b(xp.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cya.a($$0, $$8, $$5);
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
