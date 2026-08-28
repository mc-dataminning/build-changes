import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dao extends czy {
   public dao(czv $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cvp, cvp> a(czw $$0) {
      cvp $$1 = null;
      cvp $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cvp $$4 = $$0.a($$3);
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

   private static boolean a(cvp $$0, cvp $$1) {
      return $$1.a($$0.h()) && $$0.J() == 1 && $$1.J() == 1 && $$0.b(kr.d) && $$1.b(kr.d) && $$0.b(kr.e) && $$1.b(kr.e);
   }

   public boolean a(czw $$0, deg $$1) {
      return this.a($$0) != null;
   }

   public cvp a(czw $$0, jp.a $$1) {
      Pair<cvp, cvp> $$2 = this.a($$0);
      if ($$2 == null) {
         return cvp.k;
      } else {
         cvp $$3 = (cvp)$$2.getFirst();
         cvp $$4 = (cvp)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cvp $$9 = new cvp($$3.h());
         $$9.b(kr.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dbq $$10 = dbm.b($$3);
         dbq $$11 = dbm.b($$4);
         dbm.a($$9, $$3x -> $$1.b(lv.aM).b().filter($$0xx -> $$0xx.a(aww.o)).forEach($$3xx -> {
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
   public dam<?> aq_() {
      return dam.n;
   }
}
