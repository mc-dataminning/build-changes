import javax.annotation.Nullable;

public class dav extends cyg {
   public dav(dnc $$0, czu.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public ddr b(ddr $$0) {
      iv $$1 = $$0.a();
      djx $$2 = $$0.q();
      ebe $$3 = $$2.a_($$1);
      dnc $$4 = this.c();
      if (!$$3.a($$4)) {
         return dtz.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jb $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jb.b ? $$0.g() : jb.b;
         }

         int $$7 = 0;
         iv.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               crx $$9 = $$0.o();
               int $$10 = $$2.ao();
               if ($$9 instanceof art && $$8.v() > $$10) {
                  ((art)$$9).b(xa.a("build.tooHigh", $$10).a(o.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.c())) {
               if ($$3.a($$0)) {
                  return ddr.a($$0, $$8, $$5);
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
   protected boolean b() {
      return false;
   }
}
