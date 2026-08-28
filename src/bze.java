import com.google.common.collect.ImmutableMap;

public class bze<E extends clz> extends bvf<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bze(int $$0) {
      super(ImmutableMap.of(ccq.aB, ccr.a, ccq.o, ccr.b, ccq.m, ccr.b, ccq.n, ccr.c, ccq.B, ccr.c, ccq.az, ccr.c, ccq.aG, ccr.c), $$0);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      $$1.a(avo.BV, 5.0F, 1.0F);
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      if ($$1.c(bty.m)) {
         $$1.b(bty.a);
      }

      $$1.dU().b(ccq.aB);
      $$1.dU().c(ccq.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dU().a(ccq.az)) {
            cma.a($$1, $$1x.dq());
         }
      });
   }
}
