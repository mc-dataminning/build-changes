import javax.annotation.Nullable;

public class cjq extends cgp {
   public cjq(csk $$0, cir.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cle b(cle $$0) {
      gv $$1 = $$0.a();
      cpk $$2 = $$0.q();
      dey $$3 = $$2.a_($$1);
      csk $$4 = this.e();
      if (!$$3.a($$4)) {
         return cyz.a($$2, $$1) == 7 ? null : $$0;
      } else {
         hb $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == hb.b ? $$0.g() : hb.b;
         }

         int $$7 = 0;
         gv.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cbl $$9 = $$0.o();
               int $$10 = $$2.aj();
               if ($$9 instanceof akj && $$8.v() >= $$10) {
                  ((akj)$$9).b(te.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return cle.a($$0, $$8, $$5);
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
