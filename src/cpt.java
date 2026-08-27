import javax.annotation.Nullable;

public class cpt extends cms {
   public cpt(cyo $$0, cou.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public crg b(crg $$0) {
      hz $$1 = $$0.a();
      cvn $$2 = $$0.q();
      dlf $$3 = $$2.a_($$1);
      cyo $$4 = this.e();
      if (!$$3.a($$4)) {
         return dfc.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ie $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ie.b ? $$0.g() : ie.b;
         }

         int $$7 = 0;
         hz.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               chh $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof aow && $$8.v() >= $$10) {
                  ((aow)$$9).b(vq.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return crg.a($$0, $$8, $$5);
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
