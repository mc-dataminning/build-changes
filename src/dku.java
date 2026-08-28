import com.mojang.serialization.MapCodec;

public class dku extends djj {
   public static final MapCodec<dku> b = b(dku::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dku> a() {
      return b;
   }

   public dku(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dxu $$6 = $$1.a_($$5);
         dkl $$7 = null;
         if (h($$6)) {
            $$7 = dkn.qT;
         } else if ($$6.a(dkn.qT) && $$6.c(djk.d) == $$4) {
            $$7 = dkn.qS;
         } else if ($$6.a(dkn.qS) && $$6.c(djk.d) == $$4) {
            $$7 = dkn.qR;
         } else if ($$6.a(dkn.qR) && $$6.c(djk.d) == $$4) {
            $$7 = dkn.qQ;
         }

         if ($$7 != null) {
            dxu $$8 = $$7.m().b(djk.d, $$4).b(djk.c, Boolean.valueOf($$6.y().a() == etx.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dxu $$0) {
      return $$0.l() || $$0.a(dkn.J) && $$0.y().e() == 8;
   }
}
