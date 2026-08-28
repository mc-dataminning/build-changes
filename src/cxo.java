import javax.annotation.Nullable;

public class cxo extends cuv {
   public cxo(djm $$0, cwl.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public dag b(dag $$0) {
      ji $$1 = $$0.a();
      dgi $$2 = $$0.q();
      dwx $$3 = $$2.a_($$1);
      djm $$4 = this.d();
      if (!$$3.a($$4)) {
         return dqg.a($$2, $$1) == 7 ? null : $$0;
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
               cox $$9 = $$0.o();
               int $$10 = $$2.an();
               if ($$9 instanceof ard && $$8.v() > $$10) {
                  ((ard)$$9).b(wo.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return dag.a($$0, $$8, $$5);
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
