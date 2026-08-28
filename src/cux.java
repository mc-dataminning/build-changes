import javax.annotation.Nullable;

public class cux extends cry {
   public cux(dff $$0, ctv.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cxk b(cxk $$0) {
      ja $$1 = $$0.a();
      dcd $$2 = $$0.q();
      dsh $$3 = $$2.a_($$1);
      dff $$4 = this.d();
      if (!$$3.a($$4)) {
         return dlu.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jf $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jf.b ? $$0.g() : jf.b;
         }

         int $$7 = 0;
         ja.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cmh $$9 = $$0.o();
               int $$10 = $$2.am();
               if ($$9 instanceof aql && $$8.v() >= $$10) {
                  ((aql)$$9).b(wu.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cxk.a($$0, $$8, $$5);
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
