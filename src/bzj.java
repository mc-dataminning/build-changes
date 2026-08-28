import com.google.common.collect.ImmutableMap;

public class bzj<E extends cmd> extends bvk<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzj(int $$0) {
      super(ImmutableMap.of(ccv.aB, ccw.a, ccv.o, ccw.b, ccv.m, ccw.b, ccv.n, ccw.c, ccv.B, ccw.c, ccv.az, ccw.c, ccv.aG, ccw.c), $$0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, E $$1, long $$2) {
      $$1.a(awa.BR, 5.0F, 1.0F);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.c(bud.m)) {
         $$1.b(bud.a);
      }

      $$1.dS().b(ccv.aB);
      $$1.dS().c(ccv.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(ccv.az)) {
            cme.a($$1, $$1x.dp());
         }
      });
   }
}
