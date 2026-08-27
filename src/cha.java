import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cha extends brh<cgw> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public cha() {
      super(ImmutableMap.of(bys.o, byt.a, bys.aY, byt.b, bys.aW, byt.b, bys.aX, byt.b, bys.aV, byt.a, bys.m, byt.b, bys.ba, byt.b), h + 1 + i);
   }

   protected boolean a(apf $$0, cgw $$1) {
      return $$1.ap() != bqa.a ? false : $$1.dP().c(bys.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dP().b(bys.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(apf $$0, cgw $$1, long $$2) {
      return $$1.dP().a(bys.o) && $$1.dP().a(bys.aV);
   }

   protected void b(apf $$0, cgw $$1, long $$2) {
      $$1.dP().c(bys.o).ifPresent($$1x -> $$1.b(bqa.q));
      $$1.dP().a(bys.aW, axy.a, (long)h);
      $$1.a(aty.cF, 1.0F, 1.0F);
   }

   protected void c(apf $$0, cgw $$1, long $$2) {
      if ($$1.ap() == bqa.q) {
         $$1.b(bqa.a);
      }

      $$1.dP().a(bys.aY, axy.a, (long)j);
      $$1.dP().b(bys.aV);
   }

   protected void d(apf $$0, cgw $$1, long $$2) {
      bqq<cgw> $$3 = $$1.dP();
      bpp $$4 = $$3.c(bys.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eg.a.b, $$4.dk());
         if (!$$3.c(bys.aW).isPresent() && !$$3.c(bys.aX).isPresent()) {
            $$3.a(bys.aX, axy.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               ckd $$8 = new ckd($$1, $$0);
               $$1.a(aty.cI, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.aj().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(cgw $$0, bpp $$1) {
      ept $$2 = $$0.f(1.0F);
      ept $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(cgw $$0, bpp $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
