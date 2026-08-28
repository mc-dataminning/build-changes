import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bsy extends bst {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azl> e;

   protected bsy(bsu $$0, int $$1, ToIntFunction<azl> $$2) {
      super($$0, $$1, ln.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bsy.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azd.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(buk $$0, int $$1, bto.c $$2) {
      if ($$2 == bto.c.a) {
         int $$3 = this.e.applyAsInt($$0.dV());
         deg $$4 = $$0.dS();
         int $$5 = $$4.ac().c(dec.u);
         int $$6 = a($$5, bsy.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dS(), $$0.dx(), $$0.dz() + 0.5, $$0.dD());
         }
      }
   }

   private void a(deg $$0, double $$1, double $$2, double $$3) {
      clj $$4 = btv.aP.a($$0, btu.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.C_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bsy.a a(buk $$0) {
         return $$1 -> {
            List<clj> $$2 = new ArrayList<>();
            $$0.dS().a(btv.aP, $$0.cO().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
