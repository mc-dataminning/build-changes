import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dba extends dak {
   public dba(dah $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cwf, cwf> a(dai $$0) {
      cwf $$1 = null;
      cwf $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwf $$4 = $$0.a($$3);
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

   private static boolean a(cwf $$0, cwf $$1) {
      return $$1.a($$0.h()) && $$0.L() == 1 && $$1.L() == 1 && $$0.b(ku.d) && $$1.b(ku.d) && $$0.b(ku.e) && $$1.b(ku.e);
   }

   public boolean a(dai $$0, dff $$1) {
      return this.a($$0) != null;
   }

   public cwf a(dai $$0, js.a $$1) {
      Pair<cwf, cwf> $$2 = this.a($$0);
      if ($$2 == null) {
         return cwf.k;
      } else {
         cwf $$3 = (cwf)$$2.getFirst();
         cwf $$4 = (cwf)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cwf $$9 = new cwf($$3.h());
         $$9.b(ku.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dcc $$10 = dby.b($$3);
         dcc $$11 = dby.b($$4);
         dby.a($$9, $$3x -> $$1.d(ma.aM).c().filter($$0xx -> $$0xx.a(axg.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public day<?> aq_() {
      return day.n;
   }
}
