import javax.annotation.Nullable;

public class cnb extends cka {
   public cnb(cvz $$0, cmc.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public coq b(coq $$0) {
      hv $$1 = $$0.a();
      csy $$2 = $$0.q();
      dip $$3 = $$2.a_($$1);
      cvz $$4 = this.e();
      if (!$$3.a($$4)) {
         return dcn.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ia $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ia.b ? $$0.g() : ia.b;
         }

         int $$7 = 0;
         hv.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cer $$9 = $$0.o();
               int $$10 = $$2.ak();
               if ($$9 instanceof amq && $$8.v() >= $$10) {
                  ((amq)$$9).b(vb.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return coq.a($$0, $$8, $$5);
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
