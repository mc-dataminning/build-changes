import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dck extends dbq {
   public dck(dbn $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cxk, cxk> c(dbo $$0) {
      cxk $$1 = null;
      cxk $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cxk $$4 = $$0.a($$3);
         if (!$$4.f()) {
            if ($$1 == null) {
               $$1 = $$4;
            } else {
               if ($$2 != null) {
                  return null;
               }

               $$2 = $$4;
            }
         }
      }

      return $$1 != null && $$2 != null && a($$1, $$2) ? Pair.of($$1, $$2) : null;
   }

   private static boolean a(cxk $$0, cxk $$1) {
      return $$1.a($$0.h()) && $$0.L() == 1 && $$1.L() == 1 && $$0.b(ku.d) && $$1.b(ku.d) && $$0.b(ku.e) && $$1.b(ku.e);
   }

   public boolean a(dbo $$0, dha $$1) {
      return this.c($$0) != null;
   }

   public cxk a(dbo $$0, js.a $$1) {
      Pair<cxk, cxk> $$2 = this.c($$0);
      if ($$2 == null) {
         return cxk.k;
      } else {
         cxk $$3 = (cxk)$$2.getFirst();
         cxk $$4 = (cxk)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cxk $$9 = new cxk($$3.h());
         $$9.b(ku.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         ddx $$10 = ddt.b($$3);
         ddx $$11 = ddt.b($$4);
         ddt.a($$9, $$3x -> $$1.d(mb.aN).c().filter($$0xx -> $$0xx.a(axx.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dci<dck> a() {
      return dci.n;
   }
}
