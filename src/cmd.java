import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cmd extends bwf<clz> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cmd() {
      super(ImmutableMap.of(cdq.o, cdr.a, cdq.aY, cdr.b, cdq.aW, cdr.b, cdq.aX, cdr.b, cdq.aV, cdr.a, cdq.m, cdr.b, cdq.ba, cdr.b), g + 1 + h);
   }

   protected boolean a(arj $$0, clz $$1) {
      return $$1.av() != buz.a ? false : $$1.dY().c(cdq.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dY().b(cdq.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(arj $$0, clz $$1, long $$2) {
      return $$1.dY().a(cdq.o) && $$1.dY().a(cdq.aV);
   }

   protected void b(arj $$0, clz $$1, long $$2) {
      $$1.dY().c(cdq.o).ifPresent($$1x -> $$1.b(buz.q));
      $$1.dY().a(cdq.aW, bak.a, (long)g);
      $$1.a(awg.cG, 1.0F, 1.0F);
   }

   protected void c(arj $$0, clz $$1, long $$2) {
      if ($$1.av() == buz.q) {
         $$1.b(buz.a);
      }

      $$1.dY().a(cdq.aY, bak.a, (long)i);
      $$1.dY().b(cdq.aV);
   }

   protected void d(arj $$0, clz $$1, long $$2) {
      bvo<clz> $$3 = $$1.dY();
      bun $$4 = $$3.c(cdq.o).orElse(null);
      if ($$4 != null) {
         $$1.a(fg.a.b, $$4.dq());
         if (!$$3.c(cdq.aW).isPresent() && !$$3.c(cdq.aX).isPresent()) {
            $$3.a(cdq.aX, bak.a, (long)h);
            if (a($$1, $$4)) {
               double $$5 = $$4.dx() - $$1.dx();
               double $$6 = $$4.e($$4.bW() ? 0.8 : 0.3) - $$1.gq();
               double $$7 = $$4.dD() - $$1.dD();
               cor.a(new cpi($$1, $$0), $$0, cvs.k, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.am().a() * 4));
               $$1.a(awg.cJ, 1.5F, 1.0F);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(clz $$0, bun $$1) {
      eyw $$2 = $$0.g(1.0F);
      eyw $$3 = $$1.dq().d($$0.dq()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(clz $$0, bun $$1) {
      double $$2 = $$0.dq().g($$1.dq());
      return $$2 < 256.0;
   }
}
