import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class frs implements frn.a {
   private final eqv a;
   private static final int b = 10;

   public frs(eqv $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elp $$0, foe $$1, double $$2, double $$3, double $$4) {
      cpv $$5 = this.a.r;
      gw $$6 = gw.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (gw $$8 : gw.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cqe.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = arw.h($$10, 0.9F, 0.9F);
         long $$12 = hw.e($$8.a());
         if ($$7.add($$12)) {
            frn.a(
               $$0,
               $$1,
               $$5.J().p().a(cqe.a, hw.a($$12)),
               (double)hw.a(hw.b($$12), 8),
               (double)hw.a(hw.c($$12), 8),
               (double)hw.a(hw.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            frn.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
