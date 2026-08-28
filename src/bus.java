import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bus extends bun {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<bam> e;

   protected bus(buo $$0, int $$1, ToIntFunction<bam> $$2) {
      super($$0, $$1, ls.V);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bus.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : bae.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(ash $$0, bwg $$1, int $$2, bvk.d $$3) {
      if ($$3 == bvk.d.a) {
         int $$4 = this.e.applyAsInt($$1.dZ());
         int $$5 = $$0.N().c(dhe.v);
         int $$6 = a($$5, bus.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.dW(), $$1.dB(), $$1.dD() + 0.5, $$1.dH());
         }
      }
   }

   private void a(dhi $$0, double $$1, double $$2, double $$3) {
      cng $$4 = bvr.bh.a($$0, bvq.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.H_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bus.a a(bwg $$0) {
         return $$1 -> {
            List<cng> $$2 = new ArrayList<>();
            $$0.dW().a(bvr.bh, $$0.cR().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
