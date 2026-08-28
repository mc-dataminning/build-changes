import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class btm extends bth {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<azs> e;

   protected btm(bti $$0, int $$1, ToIntFunction<azs> $$2) {
      super($$0, $$1, lr.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, btm.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : azk.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(bva $$0, int $$1, bue.c $$2) {
      if ($$2 == bue.c.a) {
         int $$3 = this.e.applyAsInt($$0.ea());
         dfb $$4 = $$0.dX();
         int $$5 = $$4.ac().c(dex.u);
         int $$6 = a($$5, btm.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dX(), $$0.dC(), $$0.dE() + 0.5, $$0.dI());
         }
      }
   }

   private void a(dfb $$0, double $$1, double $$2, double $$3) {
      cma $$4 = bul.aP.a($$0, buk.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static btm.a a(bva $$0) {
         return $$1 -> {
            List<cma> $$2 = new ArrayList<>();
            $$0.dX().a(bul.aP, $$0.cS().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
