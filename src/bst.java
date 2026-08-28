import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bst extends bso {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azk> e;

   protected bst(bsp $$0, int $$1, ToIntFunction<azk> $$2) {
      super($$0, $$1, ln.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bst.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azc.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(buf $$0, int $$1, btj.c $$2) {
      if ($$2 == btj.c.a) {
         int $$3 = this.e.applyAsInt($$0.dV());
         dds $$4 = $$0.dS();
         int $$5 = $$4.ac().c(ddo.u);
         int $$6 = a($$5, bst.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dS(), $$0.dx(), $$0.dz() + 0.5, $$0.dD());
         }
      }
   }

   private void a(dds $$0, double $$1, double $$2, double $$3) {
      cle $$4 = btq.aP.a($$0, btp.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.C_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bst.a a(buf $$0) {
         return $$1 -> {
            List<cle> $$2 = new ArrayList<>();
            $$0.dS().a(btq.aP, $$0.cO().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
