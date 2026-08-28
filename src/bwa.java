import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bwa extends bvv {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azx> e;

   protected bwa(bvw $$0, int $$1, ToIntFunction<azx> $$2) {
      super($$0, $$1, ly.X);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bwa.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azo.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(ars $$0, bxu $$1, int $$2, bwt.d $$3) {
      if ($$3 == bwt.d.a) {
         int $$4 = this.e.applyAsInt($$1.dY());
         int $$5 = $$0.O().d(djt.w);
         int $$6 = a($$5, bwa.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG());
         }
      }
   }

   private void a(djx $$0, double $$1, double $$2, double $$3) {
      cpi $$4 = bxc.bi.a($$0, bxb.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.G_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bwa.a a(bxu $$0) {
         return $$1 -> {
            List<cpi> $$2 = new ArrayList<>();
            $$0.dV().a(bxc.bi, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
