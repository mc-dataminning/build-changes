import javax.annotation.Nullable;

public class cns extends ckr {
   public cns(cwq $$0, cmt.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cph b(cph $$0) {
      hx $$1 = $$0.a();
      ctp $$2 = $$0.q();
      djh $$3 = $$2.a_($$1);
      cwq $$4 = this.e();
      if (!$$3.a($$4)) {
         return dde.a($$2, $$1) == 7 ? null : $$0;
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
               cfi $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof ane && $$8.v() >= $$10) {
                  ((ane)$$9).b(vf.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return cph.a($$0, $$8, $$5);
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
