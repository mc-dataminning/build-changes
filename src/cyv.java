import javax.annotation.Nullable;

public class cyv extends cwf {
   public cyv(dku $$0, cxu.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public dbn b(dbn $$0) {
      jj $$1 = $$0.a();
      dhp $$2 = $$0.q();
      dym $$3 = $$2.a_($$1);
      dku $$4 = this.d();
      if (!$$3.a($$4)) {
         return dro.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jo $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jo.b ? $$0.g() : jo.b;
         }

         int $$7 = 0;
         jj.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               cqi $$9 = $$0.o();
               int $$10 = $$2.ao();
               if ($$9 instanceof aro && $$8.v() > $$10) {
                  ((aro)$$9).b(wv.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return dbn.a($$0, $$8, $$5);
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
