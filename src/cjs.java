import javax.annotation.Nullable;

public class cjs extends cgr {
   public cjs(csm $$0, cit.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public clg b(clg $$0) {
      gu $$1 = $$0.a();
      cpm $$2 = $$0.q();
      dfa $$3 = $$2.a_($$1);
      csm $$4 = this.e();
      if (!$$3.a($$4)) {
         return czb.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ha $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ha.b ? $$0.g() : ha.b;
         }

         int $$7 = 0;
         gu.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.j($$8)) {
               cbn $$9 = $$0.o();
               int $$10 = $$2.aj();
               if ($$9 instanceof akl && $$8.v() >= $$10) {
                  ((akl)$$9).b(tf.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return clg.a($$0, $$8, $$5);
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
