import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class cqk extends bzw<cqg> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public cqk() {
      super(ImmutableMap.of(chh.p, chi.a, chh.aZ, chi.b, chh.aX, chi.b, chh.aY, chi.b, chh.aW, chi.a, chh.n, chi.b, chh.bb, chi.b), g + 1 + h);
   }

   protected boolean a(asb $$0, cqg $$1) {
      return $$1.at() != byr.a ? false : $$1.ec().c(chh.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.ec().b(chh.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(asb $$0, cqg $$1, long $$2) {
      return $$1.ec().a(chh.p) && $$1.ec().a(chh.aW);
   }

   protected void b(asb $$0, cqg $$1, long $$2) {
      $$1.ec().c(chh.p).ifPresent($$1x -> $$1.b(byr.q));
      $$1.ec().a(chh.aX, bbh.a, (long)g);
      $$1.a(awy.cG, 1.0F, 1.0F);
   }

   protected void c(asb $$0, cqg $$1, long $$2) {
      if ($$1.at() == byr.q) {
         $$1.b(byr.a);
      }

      $$1.ec().a(chh.aZ, bbh.a, (long)i);
      $$1.ec().b(chh.aW);
   }

   protected void d(asb $$0, cqg $$1, long $$2) {
      bzf<cqg> $$3 = $$1.ec();
      byf $$4 = $$3.c(chh.p).orElse(null);
      if ($$4 != null) {
         $$1.a(ew.a.b, $$4.dt());
         if (!$$3.c(chh.aX).isPresent() && !$$3.c(chh.aY).isPresent()) {
            $$3.a(chh.aY, bbh.a, (long)h);
            double $$5 = $$4.dA() - $$1.dA();
            double $$6 = $$4.e($$4.bY() ? 0.8 : 0.3) - $$1.x();
            double $$7 = $$4.dG() - $$1.dG();
            ctd.a(new ctv($$1, $$0), $$0, dak.l, $$5, $$6, $$7, 0.7F, (float)(5 - $$0.an().a() * 4));
            $$1.a(awy.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(cqg $$0, byf $$1) {
      double $$2 = $$0.dt().g($$1.dt());
      return $$2 < 256.0;
   }
}
