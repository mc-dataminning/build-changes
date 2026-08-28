import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bun extends bui {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<bam> e;

   protected bun(buj $$0, int $$1, ToIntFunction<bam> $$2) {
      super($$0, $$1, ls.V);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bun.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : bae.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(ash $$0, bwb $$1, int $$2, bvf.c $$3) {
      if ($$3 == bvf.c.a) {
         int $$4 = this.e.applyAsInt($$1.dY());
         int $$5 = $$0.N().c(dgw.u);
         int $$6 = a($$5, bun.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG());
         }
      }
   }

   private void a(dha $$0, double $$1, double $$2, double $$3) {
      cnb $$4 = bvm.bh.a($$0, bvl.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.H_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bun.a a(bwb $$0) {
         return $$1 -> {
            List<cnb> $$2 = new ArrayList<>();
            $$0.dV().a(bvm.bh, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
