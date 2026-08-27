import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class frn implements fri.a {
   private final eqq a;
   private static final int b = 10;

   public frn(eqq $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elk $$0, fnz $$1, double $$2, double $$3, double $$4) {
      cpq $$5 = this.a.r;
      gw $$6 = gw.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (gw $$8 : gw.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cpz.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = ars.h($$10, 0.9F, 0.9F);
         long $$12 = hz.e($$8.a());
         if ($$7.add($$12)) {
            fri.a(
               $$0,
               $$1,
               $$5.J().p().a(cpz.a, hz.a($$12)),
               (double)hz.a(hz.b($$12), 8),
               (double)hz.a(hz.c($$12), 8),
               (double)hz.a(hz.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            fri.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
