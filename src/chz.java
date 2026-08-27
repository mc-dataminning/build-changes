import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class chz extends bsg<chv> {
   private static final int c = 4;
   private static final int d = 256;
   private static final int e = 5;
   private static final int f = 4;
   private static final float g = 0.7F;
   private static final int h = Math.round(15.0F);
   private static final int i = Math.round(4.0F);
   private static final int j = Math.round(10.0F);

   @VisibleForTesting
   public chz() {
      super(ImmutableMap.of(bzr.o, bzs.a, bzr.aY, bzs.b, bzr.aW, bzs.b, bzr.aX, bzs.b, bzr.aV, bzs.a, bzr.m, bzs.b, bzr.ba, bzs.b), h + 1 + i);
   }

   protected boolean a(aps $$0, chv $$1) {
      return $$1.ap() != bqz.a ? false : $$1.dP().c(bzr.o).map($$1x -> b($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.dP().b(bzr.aV);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aps $$0, chv $$1, long $$2) {
      return $$1.dP().a(bzr.o) && $$1.dP().a(bzr.aV);
   }

   protected void b(aps $$0, chv $$1, long $$2) {
      $$1.dP().c(bzr.o).ifPresent($$1x -> $$1.b(bqz.q));
      $$1.dP().a(bzr.aW, aym.a, (long)h);
      $$1.a(aum.cG, 1.0F, 1.0F);
   }

   protected void c(aps $$0, chv $$1, long $$2) {
      if ($$1.ap() == bqz.q) {
         $$1.b(bqz.a);
      }

      $$1.dP().a(bzr.aY, aym.a, (long)j);
      $$1.dP().b(bzr.aV);
   }

   protected void d(aps $$0, chv $$1, long $$2) {
      brp<chv> $$3 = $$1.dP();
      bqo $$4 = $$3.c(bzr.o).orElse(null);
      if ($$4 != null) {
         $$1.a(eg.a.b, $$4.dk());
         if (!$$3.c(bzr.aW).isPresent() && !$$3.c(bzr.aX).isPresent()) {
            $$3.a(bzr.aX, aym.a, (long)i);
            if (a($$1, $$4)) {
               double $$5 = $$4.dr() - $$1.dr();
               double $$6 = $$4.e(0.3) - $$1.e(0.5);
               double $$7 = $$4.dx() - $$1.dx();
               clc $$8 = new clc($$1, $$0);
               $$1.a(aum.cJ, 1.5F, 1.0F);
               $$8.c($$5, $$6, $$7, 0.7F, (float)(5 - $$0.ak().a() * 4));
               $$0.b($$8);
            }
         }
      }
   }

   @VisibleForTesting
   public static boolean a(chv $$0, bqo $$1) {
      esa $$2 = $$0.f(1.0F);
      esa $$3 = $$1.dk().d($$0.dk()).d();
      return $$2.b($$3) > 0.5;
   }

   private static boolean b(chv $$0, bqo $$1) {
      double $$2 = $$0.dk().g($$1.dk());
      return $$2 > 4.0 && $$2 < 256.0;
   }
}
