import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bur extends bum {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<bam> e;

   protected bur(bun $$0, int $$1, ToIntFunction<bam> $$2) {
      super($$0, $$1, ls.V);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bur.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : bae.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(ash $$0, bwf $$1, int $$2, bvj.c $$3) {
      if ($$3 == bvj.c.a) {
         int $$4 = this.e.applyAsInt($$1.dY());
         int $$5 = $$0.N().c(dhd.v);
         int $$6 = a($$5, bur.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG());
         }
      }
   }

   private void a(dhh $$0, double $$1, double $$2, double $$3) {
      cnf $$4 = bvq.bh.a($$0, bvp.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.H_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bur.a a(bwf $$0) {
         return $$1 -> {
            List<cnf> $$2 = new ArrayList<>();
            $$0.dV().a(bvq.bh, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
