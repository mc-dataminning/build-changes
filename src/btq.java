import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class btq extends btl {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azv> e;

   protected btq(btm $$0, int $$1, ToIntFunction<azv> $$2) {
      super($$0, $$1, ls.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, btq.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azn.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(bve $$0, int $$1, bui.c $$2) {
      if ($$2 == bui.c.a) {
         int $$3 = this.e.applyAsInt($$0.eb());
         dff $$4 = $$0.dY();
         int $$5 = $$4.ac().c(dfb.u);
         int $$6 = a($$5, btq.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dY(), $$0.dD(), $$0.dF() + 0.5, $$0.dJ());
         }
      }
   }

   private void a(dff $$0, double $$1, double $$2, double $$3) {
      cme $$4 = bup.aP.a($$0, buo.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static btq.a a(bve $$0) {
         return $$1 -> {
            List<cme> $$2 = new ArrayList<>();
            $$0.dY().a(bup.aP, $$0.cT().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
