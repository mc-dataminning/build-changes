import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cke extends buj<cka> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cke() {
      super(ImmutableMap.of(cbu.o, cbv.a, cbu.aY, cbv.b, cbu.aW, cbv.b, cbu.aX, cbv.b, cbu.aV, cbv.a, cbu.m, cbv.b, cbu.ba, cbv.b), h + 1 + i);
   }

   protected boolean a(aqn $$0, cka $$1) {
      return $$1.ar() != btc.a ? false : $$1.dS().c(cbu.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(cbu.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqn $$0, cka $$1, long $$2) {
      return $$1.dS().a(cbu.o) && $$1.dS().a(cbu.aV);
   }

   protected void b(aqn $$0, cka $$1, long $$2) {
      $$1.dS().c(cbu.o).ifPresent($$1x -> $$1.b(btc.q));
      $$1.dS().a(cbu.aW, azh.a, (long)h);
      $$1.a(avi.cG, 1.0F, 1.0F);
   }

   protected void c(aqn $$0, cka $$1, long $$2) {
      if ($$1.ar() == btc.q) {
         $$1.b(btc.a);
      }

      $$1.dS().a(cbu.aY, azh.a, (long)j);
      $$1.dS().b(cbu.aV);
   }

   protected void d(aqn $$0, cka $$1, long $$2) {
      bts<cka> $$3 = $$1.dS();
      bsq $$4 = $$3.c(cbu.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eq.a.b, $$4.dn());
         if (!$$3.c(cbu.aW).isPresent() && !$$3.c(cbu.aX).isPresent()) {
            $$3.a(cbu.aX, azh.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               cnh $$8 = new cnh($$1, $$0);
               $$1.a(avi.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cka $$0, bsq $$1) {
      eum $$2 = $$0.f(1.0F);
      eum $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cka $$0, bsq $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
