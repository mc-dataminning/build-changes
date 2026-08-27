import javax.annotation.Nullable;

public class cjz extends cgy {
   public cjz(csv $$0, cja.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cln b(cln $$0) {
      gw $$1 = $$0.a();
      cpv $$2 = $$0.q();
      dfj $$3 = $$2.a_($$1);
      csv $$4 = this.e();
      if (!$$3.a($$4)) {
         return czk.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ha $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ha.b ? $$0.g() : ha.b;
         }

         int $$7 = 0;
         gw.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cbu $$9 = $$0.o();
               int $$10 = $$2.aj();
               if ($$9 instanceof akr && $$8.v() >= $$10) {
                  ((akr)$$9).b(tl.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return cln.a($$0, $$8, $$5);
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
