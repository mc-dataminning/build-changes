import javax.annotation.Nullable;

public class ckb extends cha {
   public ckb(csx $$0, cjc.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public clp b(clp $$0) {
      gw $$1 = $$0.a();
      cpx $$2 = $$0.q();
      dfl $$3 = $$2.a_($$1);
      csx $$4 = this.e();
      if (!$$3.a($$4)) {
         return czm.a($$2, $$1) == 7 ? null : $$0;
      } else {
         hc $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == hc.b ? $$0.g() : hc.b;
         }

         int $$7 = 0;
         gw.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cbw $$9 = $$0.o();
               int $$10 = $$2.aj();
               if ($$9 instanceof akt && $$8.v() >= $$10) {
                  ((akt)$$9).b(tn.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return clp.a($$0, $$8, $$5);
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
