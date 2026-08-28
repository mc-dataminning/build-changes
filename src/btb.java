import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class btb extends bsw {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azn> e;

   protected btb(bsx $$0, int $$1, ToIntFunction<azn> $$2) {
      super($$0, $$1, lo.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, btb.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azf.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(bun $$0, int $$1, btr.c $$2) {
      if ($$2 == btr.c.a) {
         int $$3 = this.e.applyAsInt($$0.dV());
         dej $$4 = $$0.dS();
         int $$5 = $$4.ac().c(def.u);
         int $$6 = a($$5, btb.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dS(), $$0.dx(), $$0.dz() + 0.5, $$0.dD());
         }
      }
   }

   private void a(dej $$0, double $$1, double $$2, double $$3) {
      clm $$4 = bty.aP.a($$0, btx.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.D_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static btb.a a(bun $$0) {
         return $$1 -> {
            List<clm> $$2 = new ArrayList<>();
            $$0.dS().a(bty.aP, $$0.cO().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
