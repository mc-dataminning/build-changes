import com.google.common.collect.ImmutableMap;

public class bzg<E extends cmb> extends bvh<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzg(int $$0) {
      super(ImmutableMap.of(ccs.aB, cct.a, ccs.o, cct.b, ccs.m, cct.b, ccs.n, cct.c, ccs.B, cct.c, ccs.az, cct.c, ccs.aG, cct.c), $$0);
   }

   protected boolean a(aqu $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqu $$0, E $$1, long $$2) {
      $$1.a(avp.BV, 5.0F, 1.0F);
   }

   protected void c(aqu $$0, E $$1, long $$2) {
      if ($$1.c(bua.m)) {
         $$1.b(bua.a);
      }

      $$1.dU().b(ccs.aB);
      $$1.dU().c(ccs.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.dU().a(ccs.az)) {
            cmc.a($$1, $$1x.dp());
         }
      });
   }
}
