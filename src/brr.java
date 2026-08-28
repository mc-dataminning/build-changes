import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class brr extends brm {
   private static final int b = 2;
   public static final int a = 2;
   private final ToIntFunction<ayo> c;

   protected brr(brn $$0, int $$1, ToIntFunction<ayo> $$2) {
      super($$0, $$1, lj.U);
      this.c = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, int $$1, int $$2) {
      return ayg.a(0, $$0 - $$1, $$2);
   }

   @Override
   public void a(btb $$0, int $$1, bsg.c $$2) {
      if ($$2 == bsg.c.a) {
         int $$3 = this.c.applyAsInt($$0.dT());
         dcf $$4 = $$0.dQ();
         int $$5 = $$4.ab().c(dcb.u);
         List<cjz> $$6 = new ArrayList<>();
         $$4.a(bsm.aP, $$0.cL().g(2.0), $$1x -> $$1x != $$0, $$6, $$5);
         int $$7 = a($$5, $$6.size(), $$3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            this.a($$0.dQ(), $$0.dv(), $$0.dx() + 0.5, $$0.dB());
         }
      }
   }

   private void a(dcf $$0, double $$1, double $$2, double $$3) {
      cjz $$4 = bsm.aP.a($$0);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }
}
