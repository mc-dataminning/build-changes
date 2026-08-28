import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cld extends bvi<ckz> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cld() {
      super(ImmutableMap.of(cct.o, ccu.a, cct.aY, ccu.b, cct.aW, ccu.b, cct.aX, ccu.b, cct.aV, ccu.a, cct.m, ccu.b, cct.ba, ccu.b), h + 1 + i);
   }

   protected boolean a(arf $$0, ckz $$1) {
      return $$1.ar() != bub.a ? false : $$1.dS().c(cct.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dS().b(cct.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arf $$0, ckz $$1, long $$2) {
      return $$1.dS().a(cct.o) && $$1.dS().a(cct.aV);
   }

   protected void b(arf $$0, ckz $$1, long $$2) {
      $$1.dS().c(cct.o).ifPresent($$1x -> $$1.b(bub.q));
      $$1.dS().a(cct.aW, bac.a, (long)h);
      $$1.a(awa.cG, 1.0F, 1.0F);
   }

   protected void c(arf $$0, ckz $$1, long $$2) {
      if ($$1.ar() == bub.q) {
         $$1.b(bub.a);
      }

      $$1.dS().a(cct.aY, bac.a, (long)j);
      $$1.dS().b(cct.aV);
   }

   protected void d(arf $$0, ckz $$1, long $$2) {
      bur<ckz> $$3 = $$1.dS();
      btp $$4 = $$3.c(cct.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fb.a.b, $$4.dn());
         if (!$$3.c(cct.aW).isPresent() && !$$3.c(cct.aX).isPresent()) {
            $$3.a(cct.aX, bac.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.du() - $$1.du();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dA() - $$1.dA();
               cog $$8 = new cog($$1, $$0);
               $$1.a(awa.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ckz $$0, btp $$1) {
      evr $$2 = $$0.f(1.0F);
      evr $$3 = $$1.dn().d($$0.dn()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ckz $$0, btp $$1) {
      double $$2 = $$0.dn().g($$1.dn());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
