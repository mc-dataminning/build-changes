import com.google.common.collect.ImmutableMap;

public class brv<E extends cef> extends bnw<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public brv(int $$0) {
      super(ImmutableMap.of(bvh.aA, bvi.a, bvh.o, bvi.b, bvh.m, bvi.b, bvh.n, bvi.c, bvh.B, bvi.c, bvh.ay, bvi.c, bvh.aF, bvi.c), $$0);
   }

   protected boolean a(amz $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(amz $$0, E $$1, long $$2) {
      $$1.a(arm.AK, 5.0F, 1.0F);
   }

   protected void c(amz $$0, E $$1, long $$2) {
      if ($$1.c(bmr.m)) {
         $$1.b(bmr.a);
      }

      $$1.dO().b(bvh.aA);
      $$1.dO().c(bvh.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dO().a(bvh.ay)) {
            ceg.a($$1, $$1x.dm());
         }
      });
   }
}
