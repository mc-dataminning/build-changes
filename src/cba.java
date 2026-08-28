import com.google.common.collect.ImmutableMap;

public class cba<E extends coa> extends bxb<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cba(int $$0) {
      super(ImmutableMap.of(cem.aB, cen.a, cem.o, cen.b, cem.m, cen.b, cem.n, cen.c, cem.B, cen.c, cem.az, cen.c, cem.aG, cen.c), $$0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.a(awa.CJ, 5.0F, 1.0F);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.c(bvu.m)) {
         $$1.b(bvu.a);
      }

      $$1.eb().b(cem.aB);
      $$1.eb().c(cem.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cem.az)) {
            cob.a($$1, $$1x.dv());
         }
      });
   }
}
