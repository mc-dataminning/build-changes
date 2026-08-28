import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cld extends bvh<ckz> {
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
      super(ImmutableMap.of(ccs.o, cct.a, ccs.aY, cct.b, ccs.aW, cct.b, ccs.aX, cct.b, ccs.aV, cct.a, ccs.m, cct.b, ccs.ba, cct.b), h + 1 + i);
   }

   protected boolean a(aqu $$0, ckz $$1) {
      return $$1.at() != bua.a ? false : $$1.dT().c(ccs.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dT().b(ccs.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aqu $$0, ckz $$1, long $$2) {
      return $$1.dT().a(ccs.o) && $$1.dT().a(ccs.aV);
   }

   protected void b(aqu $$0, ckz $$1, long $$2) {
      $$1.dT().c(ccs.o).ifPresent($$1x -> $$1.b(bua.q));
      $$1.dT().a(ccs.aW, azs.a, (long)h);
      $$1.a(avp.cG, 1.0F, 1.0F);
   }

   protected void c(aqu $$0, ckz $$1, long $$2) {
      if ($$1.at() == bua.q) {
         $$1.b(bua.a);
      }

      $$1.dT().a(ccs.aY, azs.a, (long)j);
      $$1.dT().b(ccs.aV);
   }

   protected void d(aqu $$0, ckz $$1, long $$2) {
      buq<ckz> $$3 = $$1.dT();
      btn $$4 = $$3.c(ccs.o).orElse(null);
      if ($$4 != null) {
         $$1.a(ff.a.b, $$4.dm());
         if (!$$3.c(ccs.aW).isPresent() && !$$3.c(ccs.aX).isPresent()) {
            $$3.a(ccs.aX, azs.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dt() - $$1.dt();
               double $$6 = $$4.e($$4.bS() ? 0.8 : 0.3) - $$1.e(0.5);
               double $$7 = $$4.dz() - $$1.dz();
               cog $$8 = new cog($$1, $$0);
               $$1.a(avp.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.al().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(ckz $$0, btn $$1) {
      exc $$2 = $$0.g(1.0F);
      exc $$3 = $$1.dm().d($$0.dm()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(ckz $$0, btn $$1) {
      double $$2 = $$0.dm().g($$1.dm());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
