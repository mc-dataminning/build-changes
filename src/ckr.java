import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class ckr extends buv<ckn> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public ckr() {
      super(ImmutableMap.of(ccg.o, cch.a, ccg.aY, cch.b, ccg.aW, cch.b, ccg.aX, cch.b, ccg.aV, cch.a, ccg.m, cch.b, ccg.ba, cch.b), h + 1 + i);
   }

   protected boolean a(aqm $$0, ckn $$1) {
      return $$1.at() != bto.a ? false : $$1.dV().c(ccg.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dV().b(ccg.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqm $$0, ckn $$1, long $$2) {
      return $$1.dV().a(ccg.o) && $$1.dV().a(ccg.aV);
   }

   protected void b(aqm $$0, ckn $$1, long $$2) {
      $$1.dV().c(ccg.o).ifPresent($$1x -> $$1.b(bto.q));
      $$1.dV().a(ccg.aW, azk.a, (long)h);
      $$1.a(avh.cG, 1.0F, 1.0F);
   }

   protected void c(aqm $$0, ckn $$1, long $$2) {
      if ($$1.at() == bto.q) {
         $$1.b(bto.a);
      }

      $$1.dV().a(ccg.aY, azk.a, (long)j);
      $$1.dV().b(ccg.aV);
   }

   protected void d(aqm $$0, ckn $$1, long $$2) {
      bue<ckn> $$3 = $$1.dV();
      btc $$4 = $$3.c(ccg.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fc.a.b, $$4.dp());
         if (!$$3.c(ccg.aW).isPresent() && !$$3.c(ccg.aX).isPresent()) {
            $$3.a(ccg.aX, azk.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dw() - $$1.dw();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dC() - $$1.dC();
               cnu $$8 = new cnu($$1, $$0);
               $$1.a(avh.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ckn $$0, btc $$1) {
      ewh $$2 = $$0.g(1.0F);
      ewh $$3 = $$1.dp().d($$0.dp()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ckn $$0, btc $$1) {
      double $$2 = $$0.dp().g($$1.dp());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
