import com.google.common.collect.ImmutableMap;

public class cdv<E extends crl> extends bzw<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cdv(int $$0) {
      super(ImmutableMap.of(chh.aC, chi.a, chh.p, chi.b, chh.n, chi.b, chh.o, chi.c, chh.C, chi.c, chh.aA, chi.c, chh.aH, chi.c), $$0);
   }

   protected boolean a(asb $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(asb $$0, E $$1, long $$2) {
      $$1.a(awy.CZ, 5.0F, 1.0F);
   }

   protected void c(asb $$0, E $$1, long $$2) {
      if ($$1.c(byr.m)) {
         $$1.b(byr.a);
      }

      $$1.ec().b(chh.aC);
      $$1.ec().c(chh.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(chh.aA)) {
            crm.a($$1, $$1x.dv());
         }
      });
   }
}
