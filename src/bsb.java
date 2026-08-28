import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bsb extends brw {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<ayv> e;

   protected bsb(brx $$0, int $$1, ToIntFunction<ayv> $$2) {
      super($$0, $$1, lm.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, bsb.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : ayn.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(btl $$0, int $$1, bsq.c $$2) {
      if ($$2 == bsq.c.a) {
         int $$3 = this.e.applyAsInt($$0.dT());
         dcu $$4 = $$0.dQ();
         int $$5 = $$4.ab().c(dcq.u);
         int $$6 = a($$5, bsb.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dQ(), $$0.dv(), $$0.dx() + 0.5, $$0.dB());
         }
      }
   }

   private void a(dcu $$0, double $$1, double $$2, double $$3) {
      ckk $$4 = bsw.aP.a($$0);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static bsb.a a(btl $$0) {
         return $$1 -> {
            List<ckk> $$2 = new ArrayList<>();
            $$0.dQ().a(bsw.aP, $$0.cL().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
