import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cgy extends brg<cgu> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cgy() {
      super(ImmutableMap.of(byr.o, bys.a, byr.aY, bys.b, byr.aW, bys.b, byr.aX, bys.b, byr.aV, bys.a, byr.m, bys.b, byr.ba, bys.b), h + 1 + i);
   }

   protected boolean a(apf $$0, cgu $$1) {
      return $$1.ap() != bpz.a ? false : $$1.dP().c(byr.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dP().b(byr.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(apf $$0, cgu $$1, long $$2) {
      return $$1.dP().a(byr.o) && $$1.dP().a(byr.aV);
   }

   protected void b(apf $$0, cgu $$1, long $$2) {
      $$1.dP().c(byr.o).ifPresent($$1x -> $$1.b(bpz.q));
      $$1.dP().a(byr.aW, axy.a, (long)h);
      $$1.a(aty.cB, 1.0F, 1.0F);
   }

   protected void c(apf $$0, cgu $$1, long $$2) {
      if ($$1.ap() == bpz.q) {
         $$1.b(bpz.a);
      }

      $$1.dP().a(byr.aY, axy.a, (long)j);
      $$1.dP().b(byr.aV);
   }

   protected void d(apf $$0, cgu $$1, long $$2) {
      bqp<cgu> $$3 = $$1.dP();
      bpo $$4 = $$3.c(byr.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eg.a.b, $$4.dk());
         if (!$$3.c(byr.aW).isPresent() && !$$3.c(byr.aX).isPresent()) {
            $$3.a(byr.aX, axy.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               ckb $$8 = new ckb($$1, $$0);
               $$1.a(aty.cE, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.aj().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cgu $$0, bpo $$1) {
      epr $$2 = $$0.f(1.0F);
      epr $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cgu $$0, bpo $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
