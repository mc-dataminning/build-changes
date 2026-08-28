import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bsc extends brx {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<ayw> e;

   protected bsc(bry $$0, int $$1, ToIntFunction<ayw> $$2) {
      super($$0, $$1, lm.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bsc.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : ayo.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(btn $$0, int $$1, bsr.c $$2) {
      if ($$2 == bsr.c.a) {
         int $$3 = this.e.applyAsInt($$0.dS());
         dcw $$4 = $$0.dP();
         int $$5 = $$4.ab().c(dcs.u);
         int $$6 = a($$5, bsc.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dP(), $$0.du(), $$0.dw() + 0.5, $$0.dA());
         }
      }
   }

   private void a(dcw $$0, double $$1, double $$2, double $$3) {
      ckm $$4 = bsx.aP.a($$0);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bsc.a a(btn $$0) {
         return $$1 -> {
            List<ckm> $$2 = new ArrayList<>();
            $$0.dP().a(bsx.aP, $$0.cL().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
