import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bvh extends bvc {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azt> e;

   protected bvh(bvd $$0, int $$1, ToIntFunction<azt> $$2) {
      super($$0, $$1, lx.X);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bvh.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azk.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(aro $$0, bwz $$1, int $$2, bwa.e $$3) {
      if ($$3 == bwa.e.a) {
         int $$4 = this.e.applyAsInt($$1.dY());
         int $$5 = $$0.O().d(dil.v);
         int $$6 = a($$5, bvh.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG());
         }
      }
   }

   private void a(dip $$0, double $$1, double $$2, double $$3) {
      coc $$4 = bwj.bh.a($$0, bwi.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.C_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bvh.a a(bwz $$0) {
         return $$1 -> {
            List<coc> $$2 = new ArrayList<>();
            $$0.dV().a(bwj.bh, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
