import javax.annotation.Nullable;

public class cpx extends cmw {
   public cpx(cys $$0, coy.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public crk b(crk $$0) {
      hz $$1 = $$0.a();
      cvr $$2 = $$0.q();
      dlj $$3 = $$2.a_($$1);
      cys $$4 = this.e();
      if (!$$3.a($$4)) {
         return dfg.a($$2, $$1) == 7 ? null : $$0;
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
               chl $$9 = $$0.o();
               int $$10 = $$2.ak();
               if ($$9 instanceof aox && $$8.v() >= $$10) {
                  ((aox)$$9).b(vq.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return crk.a($$0, $$8, $$5);
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
