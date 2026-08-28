import com.google.common.collect.ImmutableMap;

public class cab<E extends cmy> extends bwc<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cab(int $$0) {
      super(ImmutableMap.of(cdn.aB, cdo.a, cdn.o, cdo.b, cdn.m, cdo.b, cdn.n, cdo.c, cdn.B, cdo.c, cdn.az, cdo.c, cdn.aG, cdo.c), $$0);
   }

   protected boolean a(arh $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arh $$0, E $$1, long $$2) {
      $$1.a(awe.Cb, 5.0F, 1.0F);
   }

   protected void c(arh $$0, E $$1, long $$2) {
      if ($$1.c(buw.m)) {
         $$1.b(buw.a);
      }

      $$1.dX().b(cdn.aB);
      $$1.dX().c(cdn.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.dX().a(cdn.az)) {
            cmz.a($$1, $$1x.ds());
         }
      });
   }
}
