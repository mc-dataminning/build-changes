import com.google.common.collect.ImmutableMap;

public class bzg<E extends cma> extends bvh<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bzg(int $$0) {
      super(ImmutableMap.of(ccs.aB, cct.a, ccs.o, cct.b, ccs.m, cct.b, ccs.n, cct.c, ccs.B, cct.c, ccs.az, cct.c, ccs.aG, cct.c), $$0);
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(are $$0, E $$1, long $$2) {
      $$1.a(avz.BR, 5.0F, 1.0F);
   }

   protected void c(are $$0, E $$1, long $$2) {
      if ($$1.c(bua.m)) {
         $$1.b(bua.a);
      }

      $$1.dS().b(ccs.aB);
      $$1.dS().c(ccs.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(ccs.az)) {
            cmb.a($$1, $$1x.dp());
         }
      });
   }
}
