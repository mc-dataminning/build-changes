import com.google.common.collect.ImmutableMap;

public class bwf<E extends cix> extends bsg<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bwf(int $$0) {
      super(ImmutableMap.of(bzr.aB, bzs.a, bzr.o, bzs.b, bzr.m, bzs.b, bzr.n, bzs.c, bzr.B, bzs.c, bzr.az, bzs.c, bzr.aG, bzs.c), $$0);
   }

   protected boolean a(aps $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aps $$0, E $$1, long $$2) {
      $$1.a(aum.By, 5.0F, 1.0F);
   }

   protected void c(aps $$0, E $$1, long $$2) {
      if ($$1.c(bqz.m)) {
         $$1.b(bqz.a);
      }

      $$1.dP().b(bzr.aB);
      $$1.dP().c(bzr.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dP().a(bzr.az)) {
            ciy.a($$1, $$1x.dm());
         }
      });
   }
}
