import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bvp extends bvk {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azv> e;

   protected bvp(bvl $$0, int $$1, ToIntFunction<azv> $$2) {
      super($$0, $$1, ly.X);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bvp.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azm.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(arq $$0, bxj $$1, int $$2, bwi.d $$3) {
      if ($$3 == bwi.d.a) {
         int $$4 = this.e.applyAsInt($$1.dX());
         int $$5 = $$0.O().d(djd.w);
         int $$6 = a($$5, bvp.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dU(), $$1.dz(), $$1.dB() + 0.5, $$1.dF());
         }
      }
   }

   private void a(djh $$0, double $$1, double $$2, double $$3) {
      cou $$4 = bwr.bh.a($$0, bwq.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.C_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bvp.a a(bxj $$0) {
         return $$1 -> {
            List<cou> $$2 = new ArrayList<>();
            $$0.dU().a(bwr.bh, $$0.cQ().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
