import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class fqu implements fqp.a {
   private final eqn a;
   private static final int b = 10;

   public fqu(eqn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elh $$0, fng $$1, double $$2, double $$3, double $$4) {
      cpk $$5 = this.a.s;
      gv $$6 = gv.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (gv $$8 : gv.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(cpt.a, $$8);
         float $$10 = (float)(15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = aro.h($$10, 0.9F, 0.9F);
         long $$12 = hy.e($$8.a());
         if ($$7.add($$12)) {
            fqp.a(
               $$0,
               $$1,
               $$5.J().p().a(cpt.a, hy.a($$12)),
               (double)hy.a(hy.b($$12), 8),
               (double)hy.a(hy.c($$12), 8),
               (double)hy.a(hy.d($$12), 8),
               16711680,
               0.3F
            );
         }

         if ($$9 != 15) {
            fqp.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
         }
      }
   }
}
