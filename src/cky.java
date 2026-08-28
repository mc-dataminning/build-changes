import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cky extends bvd<cku> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cky() {
      super(ImmutableMap.of(cco.o, ccp.a, cco.aY, ccp.b, cco.aW, ccp.b, cco.aX, ccp.b, cco.aV, ccp.a, cco.m, ccp.b, cco.ba, ccp.b), h + 1 + i);
   }

   protected boolean a(arb $$0, cku $$1) {
      return $$1.ar() != btw.a ? false : $$1.dS().c(cco.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(cco.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arb $$0, cku $$1, long $$2) {
      return $$1.dS().a(cco.o) && $$1.dS().a(cco.aV);
   }

   protected void b(arb $$0, cku $$1, long $$2) {
      $$1.dS().c(cco.o).ifPresent($$1x -> $$1.b(btw.q));
      $$1.dS().a(cco.aW, azx.a, (long)h);
      $$1.a(avw.cG, 1.0F, 1.0F);
   }

   protected void c(arb $$0, cku $$1, long $$2) {
      if ($$1.ar() == btw.q) {
         $$1.b(btw.a);
      }

      $$1.dS().a(cco.aY, azx.a, (long)j);
      $$1.dS().b(cco.aV);
   }

   protected void d(arb $$0, cku $$1, long $$2) {
      bum<cku> $$3 = $$1.dS();
      btk $$4 = $$3.c(cco.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fb.a.b, $$4.dn());
         if (!$$3.c(cco.aW).isPresent() && !$$3.c(cco.aX).isPresent()) {
            $$3.a(cco.aX, azx.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               cob $$8 = new cob($$1, $$0);
               $$1.a(avw.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cku $$0, btk $$1) {
      evm $$2 = $$0.f(1.0F);
      evm $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cku $$0, btk $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
