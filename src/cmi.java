import javax.annotation.Nullable;

public class cmi extends cjh {
   public cmi(cvf $$0, clj.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cnw b(cnw $$0) {
      hx $$1 = $$0.a();
      csf $$2 = $$0.q();
      dhn $$3 = $$2.a_($$1);
      cvf $$4 = this.e();
      if (!$$3.a($$4)) {
         return dbt.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ib $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ib.b ? $$0.g() : ib.b;
         }

         int $$7 = 0;
         hx.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cdz $$9 = $$0.o();
               int $$10 = $$2.ak();
               if ($$9 instanceof amj && $$8.v() >= $$10) {
                  ((amj)$$9).b(uv.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return cnw.a($$0, $$8, $$5);
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
   protected boolean d() {
      return false;
   }
}
