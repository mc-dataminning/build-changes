import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class brs extends brn {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<ayo> e;

   protected brs(bro $$0, int $$1, ToIntFunction<ayo> $$2) {
      super($$0, $$1, lj.U);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, brs.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : ayg.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(btc $$0, int $$1, bsh.d $$2) {
      if ($$2 == bsh.d.a) {
         int $$3 = this.e.applyAsInt($$0.dU());
         dcg $$4 = $$0.dR();
         int $$5 = $$4.ab().c(dcc.u);
         int $$6 = a($$5, brs.a.a($$0), $$3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$0.dR(), $$0.dw(), $$0.dy() + 0.5, $$0.dC());
         }
      }
   }

   private void a(dcg $$0, double $$1, double $$2, double $$3) {
      cka $$4 = bsn.aP.a($$0);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static brs.a a(btc $$0) {
         return $$1 -> {
            List<cka> $$2 = new ArrayList<>();
            $$0.dR().a(bsn.aP, $$0.cM().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
