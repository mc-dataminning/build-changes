import com.google.common.collect.ImmutableMap;

public class bzi<E extends cmc> extends bvj<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzi(int $$0) {
      super(ImmutableMap.of(ccu.aB, ccv.a, ccu.o, ccv.b, ccu.m, ccv.b, ccu.n, ccv.c, ccu.B, ccv.c, ccu.az, ccv.c, ccu.aG, ccv.c), $$0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, E $$1, long $$2) {
      $$1.a(awa.BR, 5.0F, 1.0F);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.c(buc.m)) {
         $$1.b(buc.a);
      }

      $$1.dS().b(ccu.aB);
      $$1.dS().c(ccu.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(ccu.az)) {
            cmd.a($$1, $$1x.dp());
         }
      });
   }
}
