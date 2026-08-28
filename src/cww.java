import javax.annotation.Nullable;

public class cww extends cuc {
   public cww(dhy $$0, cvt.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public czm b(czm $$0) {
      jg $$1 = $$0.a();
      dev $$2 = $$0.q();
      dvd $$3 = $$2.a_($$1);
      dhy $$4 = this.d();
      if (!$$3.a($$4)) {
         return don.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jl $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jl.b ? $$0.g() : jl.b;
         }

         int $$7 = 0;
         jg.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               coh $$9 = $$0.o();
               int $$10 = $$2.an();
               if ($$9 instanceof arn && $$8.v() > $$10) {
                  ((arn)$$9).b(xh.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return czm.a($$0, $$8, $$5);
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
