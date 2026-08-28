import javax.annotation.Nullable;

public class cwr extends ctu {
   public cwr(dhm $$0, cvn.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public czn b(czn $$0) {
      jf $$1 = $$0.a();
      dej $$2 = $$0.q();
      dus $$3 = $$2.a_($$1);
      dhm $$4 = this.d();
      if (!$$3.a($$4)) {
         return doc.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jk $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jk.b ? $$0.g() : jk.b;
         }

         int $$7 = 0;
         jf.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cnx $$9 = $$0.o();
               int $$10 = $$2.an();
               if ($$9 instanceof ark && $$8.v() > $$10) {
                  ((ark)$$9).b(xe.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return czn.a($$0, $$8, $$5);
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
