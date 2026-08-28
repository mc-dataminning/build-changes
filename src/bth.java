import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bth extends btc {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azr> e;

   protected bth(btd $$0, int $$1, ToIntFunction<azr> $$2) {
      super($$0, $$1, lq.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bth.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azj.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(buv $$0, int $$1, btz.c $$2) {
      if ($$2 == btz.c.a) {
         int $$3 = this.e.applyAsInt($$0.ea());
         dev $$4 = $$0.dX();
         int $$5 = $$4.ac().c(der.u);
         int $$6 = a($$5, bth.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dX(), $$0.dC(), $$0.dE() + 0.5, $$0.dI());
         }
      }
   }

   private void a(dev $$0, double $$1, double $$2, double $$3) {
      clv $$4 = bug.aP.a($$0, buf.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bth.a a(buv $$0) {
         return $$1 -> {
            List<clv> $$2 = new ArrayList<>();
            $$0.dX().a(bug.aP, $$0.cS().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
