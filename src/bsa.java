import com.google.common.collect.ImmutableMap;

public class bsa<E extends cel> extends bob<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bsa(int $$0) {
      super(ImmutableMap.of(bvm.aA, bvn.a, bvm.o, bvn.b, bvm.m, bvn.b, bvm.n, bvn.c, bvm.B, bvn.c, bvm.ay, bvn.c, bvm.aF, bvn.c), $$0);
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(and $$0, E $$1, long $$2) {
      $$1.a(arr.AK, 5.0F, 1.0F);
   }

   protected void c(and $$0, E $$1, long $$2) {
      if ($$1.c(bmw.m)) {
         $$1.b(bmw.a);
      }

      $$1.dO().b(bvm.aA);
      $$1.dO().c(bvm.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dO().a(bvm.ay)) {
            cem.a($$1, $$1x.dm());
         }
      });
   }
}
