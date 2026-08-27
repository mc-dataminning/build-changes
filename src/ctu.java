import javax.annotation.Nullable;

public class ctu extends cqx {
   public ctu(dde $$0, csu.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cwi b(cwi $$0) {
      in $$1 = $$0.a();
      dad $$2 = $$0.q();
      dqh $$3 = $$2.a_($$1);
      dde $$4 = this.d();
      if (!$$3.a($$4)) {
         return djt.a($$2, $$1) == 7 ? null : $$0;
      } else {
         is $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == is.b ? $$0.g() : is.b;
         }

         int $$7 = 0;
         in.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               clh $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof aqi && $$8.v() >= $$10) {
                  ((aqi)$$9).b(wu.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cwi.a($$0, $$8, $$5);
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
