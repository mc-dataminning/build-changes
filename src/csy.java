import javax.annotation.Nullable;

public class csy extends cqb {
   public csy(dcv $$0, cry.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cvl b(cvl $$0) {
      im $$1 = $$0.a();
      czu $$2 = $$0.q();
      dpy $$3 = $$2.a_($$1);
      dcv $$4 = this.d();
      if (!$$3.a($$4)) {
         return djk.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ir $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ir.b ? $$0.g() : ir.b;
         }

         int $$7 = 0;
         im.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               ckl $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof aqf && $$8.v() >= $$10) {
                  ((aqf)$$9).b(ws.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cvl.a($$0, $$8, $$5);
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
