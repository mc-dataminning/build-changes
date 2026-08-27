import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cfn extends bpw<cfj> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cfn() {
      super(ImmutableMap.of(bxh.o, bxi.a, bxh.aY, bxi.b, bxh.aW, bxi.b, bxh.aX, bxi.b, bxh.aV, bxi.a, bxh.m, bxi.b, bxh.ba, bxi.b), h + 1 + i);
   }

   protected boolean a(aov $$0, cfj $$1) {
      return $$1.ap() != bor.a ? false : $$1.dO().c(bxh.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dO().b(bxh.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aov $$0, cfj $$1, long $$2) {
      return $$1.dO().a(bxh.o) && $$1.dO().a(bxh.aV);
   }

   protected void b(aov $$0, cfj $$1, long $$2) {
      $$1.dO().c(bxh.o).ifPresent($$1x -> $$1.b(bor.q));
      $$1.dO().a(bxh.aW, axk.a, (long)h);
      $$1.a(atk.cy, 1.0F, 1.0F);
   }

   protected void c(aov $$0, cfj $$1, long $$2) {
      if ($$1.ap() == bor.q) {
         $$1.b(bor.a);
      }

      $$1.dO().a(bxh.aY, axk.a, (long)j);
      $$1.dO().b(bxh.aV);
   }

   protected void d(aov $$0, cfj $$1, long $$2) {
      bpf<cfj> $$3 = $$1.dO();
      bog $$4 = $$3.c(bxh.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eg.a.b, $$4.dk());
         if (!$$3.c(bxh.aW).isPresent() && !$$3.c(bxh.aX).isPresent()) {
            $$3.a(bxh.aX, axk.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               cin $$8 = new cin(bnu.bl, $$1, $$0);
               $$1.a(atk.cB, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cfj $$0, bog $$1) {
      ens $$2 = $$0.f(1.0F);
      ens $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cfj $$0, bog $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
