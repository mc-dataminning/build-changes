import javax.annotation.Nullable;

public class cvq extends cso {
   public cvq(dfy $$0, cul.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cyd b(cyd $$0) {
      jd $$1 = $$0.a();
      dcw $$2 = $$0.q();
      dtc $$3 = $$2.a_($$1);
      dfy $$4 = this.d();
      if (!$$3.a($$4)) {
         return dmo.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ji $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ji.b ? $$0.g() : ji.b;
         }

         int $$7 = 0;
         jd.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cmx $$9 = $$0.o();
               int $$10 = $$2.am();
               if ($$9 instanceof aqv && $$8.v() >= $$10) {
                  ((aqv)$$9).b(wz.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cyd.a($$0, $$8, $$5);
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
