import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class fru implements frp.a {
   private final eqx a;
   private static final int b = 10;

   public fru(eqx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elr $$0, fog $$1, double $$2, double $$3, double $$4) {
      cpx $$5 = this.a.r;
      gw $$6 = gw.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (gw $$8 : gw.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cqg.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ary.h($$10, 0.9F, 0.9F);
         long $$12 = hz.e($$8.a());
         if ($$7.add($$12)) {
            frp.a(
               $$0,
               $$1,
               $$5.J().p().a(cqg.a, hz.a($$12)),
               (double)hz.a(hz.b($$12), 8),
               (double)hz.a(hz.c($$12), 8),
               (double)hz.a(hz.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            frp.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
