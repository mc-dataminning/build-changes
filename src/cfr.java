import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cfr extends bqa<cfn> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cfr() {
      super(ImmutableMap.of(bxl.o, bxm.a, bxl.aY, bxm.b, bxl.aW, bxm.b, bxl.aX, bxm.b, bxl.aV, bxm.a, bxl.m, bxm.b, bxl.ba, bxm.b), h + 1 + i);
   }

   protected boolean a(aow $$0, cfn $$1) {
      return $$1.ap() != bot.a ? false : $$1.dO().c(bxl.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dO().b(bxl.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aow $$0, cfn $$1, long $$2) {
      return $$1.dO().a(bxl.o) && $$1.dO().a(bxl.aV);
   }

   protected void b(aow $$0, cfn $$1, long $$2) {
      $$1.dO().c(bxl.o).ifPresent($$1x -> $$1.b(bot.q));
      $$1.dO().a(bxl.aW, axk.a, (long)h);
      $$1.a(atl.cz, 1.0F, 1.0F);
   }

   protected void c(aow $$0, cfn $$1, long $$2) {
      if ($$1.ap() == bot.q) {
         $$1.b(bot.a);
      }

      $$1.dO().a(bxl.aY, axk.a, (long)j);
      $$1.dO().b(bxl.aV);
   }

   protected void d(aow $$0, cfn $$1, long $$2) {
      bpj<cfn> $$3 = $$1.dO();
      boi $$4 = $$3.c(bxl.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eg.a.b, $$4.dk());
         if (!$$3.c(bxl.aW).isPresent() && !$$3.c(bxl.aX).isPresent()) {
            $$3.a(bxl.aX, axk.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               cir $$8 = new cir(bnw.bl, $$1, $$0);
               $$1.a(atl.cC, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.aj().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cfn $$0, boi $$1) {
      enz $$2 = $$0.f(1.0F);
      enz $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cfn $$0, boi $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
