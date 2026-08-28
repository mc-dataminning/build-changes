import javax.annotation.Nullable;

public class cvo extends csm {
   public cvo(dfw $$0, cuj.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cyb b(cyb $$0) {
      jd $$1 = $$0.a();
      dcu $$2 = $$0.q();
      dta $$3 = $$2.a_($$1);
      dfw $$4 = this.d();
      if (!$$3.a($$4)) {
         return dmm.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ji $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ji.b ? $$0.g() : ji.b;
         }

         int $$7 = 0;
         jd.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cmv $$9 = $$0.o();
               int $$10 = $$2.am();
               if ($$9 instanceof aqu && $$8.v() >= $$10) {
                  ((aqu)$$9).b(wy.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cyb.a($$0, $$8, $$5);
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
