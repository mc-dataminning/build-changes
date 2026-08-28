import com.google.common.collect.ImmutableMap;

public class caz<E extends cnz> extends bxa<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public caz(int $$0) {
      super(ImmutableMap.of(cel.aB, cem.a, cel.o, cem.b, cel.m, cem.b, cel.n, cem.c, cel.B, cem.c, cel.az, cem.c, cel.aG, cem.c), $$0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.a(awa.CJ, 5.0F, 1.0F);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.c(bvt.m)) {
         $$1.b(bvt.a);
      }

      $$1.eb().b(cel.aB);
      $$1.eb().c(cel.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cel.az)) {
            coa.a($$1, $$1x.dv());
         }
      });
   }
}
