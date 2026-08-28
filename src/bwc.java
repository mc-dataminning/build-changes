import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bwc extends bvx {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azz> e;

   protected bwc(bvy $$0, int $$1, ToIntFunction<azz> $$2) {
      super($$0, $$1, lz.X);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bwc.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azq.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(aru $$0, bxw $$1, int $$2, bwv.d $$3) {
      if ($$3 == bwv.d.a) {
         int $$4 = this.e.applyAsInt($$1.dY());
         int $$5 = $$0.O().d(djv.w);
         int $$6 = a($$5, bwc.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG());
         }
      }
   }

   private void a(djz $$0, double $$1, double $$2, double $$3) {
      cpk $$4 = bxe.bi.a($$0, bxd.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.G_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bwc.a a(bxw $$0) {
         return $$1 -> {
            List<cpk> $$2 = new ArrayList<>();
            $$0.dV().a(bxe.bi, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
