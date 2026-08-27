import javax.annotation.Nullable;

public class cvm extends csc {
   public cvm(dfc $$0, cuc.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cyd b(cyd $$0) {
      ir $$1 = $$0.a();
      dca $$2 = $$0.q();
      dtc $$3 = $$2.a_($$1);
      dfc $$4 = this.d();
      if (!$$3.a($$4)) {
         return dmf.a($$2, $$1) == 7 ? null : $$0;
      } else {
         iw $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == iw.b ? $$0.g() : iw.b;
         }

         int $$7 = 0;
         ir.a $$8 = $$1.j().d($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               cly $$9 = $$0.o();
               int $$10 = $$2.am();
               if ($$9 instanceof aqu && $$8.v() >= $$10) {
                  ((aqu)$$9).b(xe.a("build.tooHigh", $$10 - 1).a(n.m), true);
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

            $$8.d($$5);
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
