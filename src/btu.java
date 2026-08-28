import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class btu extends btp {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azh> e;

   protected btu(btq $$0, int $$1, ToIntFunction<azh> $$2) {
      super($$0, $$1, lt.W);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, btu.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : ayz.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(ard $$0, bvi $$1, int $$2, bum.d $$3) {
      if ($$3 == bum.d.a) {
         int $$4 = this.e.applyAsInt($$1.dY());
         int $$5 = $$0.O().c(dgf.v);
         int $$6 = a($$5, btu.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG());
         }
      }
   }

   private void a(dgj $$0, double $$1, double $$2, double $$3) {
      cmi $$4 = but.bg.a($$0, bus.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.H_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static btu.a a(bvi $$0) {
         return $$1 -> {
            List<cmi> $$2 = new ArrayList<>();
            $$0.dV().a(but.bg, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
