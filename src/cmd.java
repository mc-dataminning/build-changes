import javax.annotation.Nullable;

public class cmd extends cjc {
   public cmd(cva $$0, cle.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cnr b(cnr $$0) {
      ht $$1 = $$0.a();
      csa $$2 = $$0.q();
      dhi $$3 = $$2.a_($$1);
      cva $$4 = this.e();
      if (!$$3.a($$4)) {
         return dbo.a($$2, $$1) == 7 ? null : $$0;
      } else {
         hx $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == hx.b ? $$0.g() : hx.b;
         }

         int $$7 = 0;
         ht.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cdu $$9 = $$0.o();
               int $$10 = $$2.ak();
               if ($$9 instanceof amf && $$8.v() >= $$10) {
                  ((amf)$$9).b(ur.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return cnr.a($$0, $$8, $$5);
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
