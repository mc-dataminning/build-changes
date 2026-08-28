import com.google.common.collect.ImmutableMap;

public class bzh<E extends cmb> extends bvi<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzh(int $$0) {
      super(ImmutableMap.of(cct.aB, ccu.a, cct.o, ccu.b, cct.m, ccu.b, cct.n, ccu.c, cct.B, ccu.c, cct.az, ccu.c, cct.aG, ccu.c), $$0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arf $$0, E $$1, long $$2) {
      $$1.a(awa.BR, 5.0F, 1.0F);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.c(bub.m)) {
         $$1.b(bub.a);
      }

      $$1.dS().b(cct.aB);
      $$1.dS().c(cct.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(cct.az)) {
            cmc.a($$1, $$1x.dp());
         }
      });
   }
}
