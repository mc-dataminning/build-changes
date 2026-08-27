import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cig extends bsl<cic> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cig() {
      super(ImmutableMap.of(bzw.o, bzx.a, bzw.aY, bzx.b, bzw.aW, bzx.b, bzw.aX, bzx.b, bzw.aV, bzx.a, bzw.m, bzx.b, bzw.ba, bzx.b), h + 1 + i);
   }

   protected boolean a(apu $$0, cic $$1) {
      return $$1.ap() != bre.a ? false : $$1.dP().c(bzw.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dP().b(bzw.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(apu $$0, cic $$1, long $$2) {
      return $$1.dP().a(bzw.o) && $$1.dP().a(bzw.aV);
   }

   protected void b(apu $$0, cic $$1, long $$2) {
      $$1.dP().c(bzw.o).ifPresent($$1x -> $$1.b(bre.q));
      $$1.dP().a(bzw.aW, ayo.a, (long)h);
      $$1.a(auo.cG, 1.0F, 1.0F);
   }

   protected void c(apu $$0, cic $$1, long $$2) {
      if ($$1.ap() == bre.q) {
         $$1.b(bre.a);
      }

      $$1.dP().a(bzw.aY, ayo.a, (long)j);
      $$1.dP().b(bzw.aV);
   }

   protected void d(apu $$0, cic $$1, long $$2) {
      bru<cic> $$3 = $$1.dP();
      bqt $$4 = $$3.c(bzw.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eh.a.b, $$4.dk());
         if (!$$3.c(bzw.aW).isPresent() && !$$3.c(bzw.aX).isPresent()) {
            $$3.a(bzw.aX, ayo.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               clj $$8 = new clj($$1, $$0);
               $$1.a(auo.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cic $$0, bqt $$1) {
      esj $$2 = $$0.f(1.0F);
      esj $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cic $$0, bqt $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
