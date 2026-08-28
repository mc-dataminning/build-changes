import com.google.common.collect.ImmutableMap;

public class bzc<E extends clw> extends bvd<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzc(int $$0) {
      super(ImmutableMap.of(cco.aB, ccp.a, cco.o, ccp.b, cco.m, ccp.b, cco.n, ccp.c, cco.B, ccp.c, cco.az, ccp.c, cco.aG, ccp.c), $$0);
   }

   protected boolean a(arb $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arb $$0, E $$1, long $$2) {
      $$1.a(avw.BR, 5.0F, 1.0F);
   }

   protected void c(arb $$0, E $$1, long $$2) {
      if ($$1.c(btw.m)) {
         $$1.b(btw.a);
      }

      $$1.dS().b(cco.aB);
      $$1.dS().c(cco.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(cco.az)) {
            clx.a($$1, $$1x.dp());
         }
      });
   }
}
