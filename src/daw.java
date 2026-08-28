import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class daw extends dag {
   public daw(dad $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cwb, cwb> a(dae $$0) {
      cwb $$1 = null;
      cwb $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwb $$4 = $$0.a($$3);
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

   private static boolean a(cwb $$0, cwb $$1) {
      return $$1.a($$0.h()) && $$0.L() == 1 && $$1.L() == 1 && $$0.b(ku.d) && $$1.b(ku.d) && $$0.b(ku.e) && $$1.b(ku.e);
   }

   public boolean a(dae $$0, dfb $$1) {
      return this.a($$0) != null;
   }

   public cwb a(dae $$0, js.a $$1) {
      Pair<cwb, cwb> $$2 = this.a($$0);
      if ($$2 == null) {
         return cwb.k;
      } else {
         cwb $$3 = (cwb)$$2.getFirst();
         cwb $$4 = (cwb)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cwb $$9 = new cwb($$3.h());
         $$9.b(ku.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dby $$10 = dbu.b($$3);
         dby $$11 = dbu.b($$4);
         dbu.a($$9, $$3x -> $$1.d(lz.aM).c().filter($$0xx -> $$0xx.a(axd.o)).forEach($$3xx -> {
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
   public dau<?> aq_() {
      return dau.n;
   }
}
