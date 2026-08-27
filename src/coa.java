import javax.annotation.Nullable;

public class coa extends cla {
   public coa(cwy $$0, cnb.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cpp b(cpp $$0) {
      hx $$1 = $$0.a();
      ctx $$2 = $$0.q();
      djp $$3 = $$2.a_($$1);
      cwy $$4 = this.e();
      if (!$$3.a($$4)) {
         return ddm.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ic $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ic.b ? $$0.g() : ic.b;
         }

         int $$7 = 0;
         hx.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cfq $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof anf && $$8.v() >= $$10) {
                  ((anf)$$9).b(vg.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return cpp.a($$0, $$8, $$5);
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
