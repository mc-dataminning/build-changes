import com.google.common.collect.ImmutableMap;

public class bzf<E extends clz> extends bvg<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzf(int $$0) {
      super(ImmutableMap.of(ccr.aB, ccs.a, ccr.o, ccs.b, ccr.m, ccs.b, ccr.n, ccs.c, ccr.B, ccs.c, ccr.az, ccs.c, ccr.aG, ccs.c), $$0);
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(are $$0, E $$1, long $$2) {
      $$1.a(avz.BR, 5.0F, 1.0F);
   }

   protected void c(are $$0, E $$1, long $$2) {
      if ($$1.c(btz.m)) {
         $$1.b(btz.a);
      }

      $$1.dS().b(ccr.aB);
      $$1.dS().c(ccr.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(ccr.az)) {
            cma.a($$1, $$1x.dp());
         }
      });
   }
}
