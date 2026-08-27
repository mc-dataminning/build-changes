import com.google.common.collect.ImmutableMap;

public class bwk<E extends cje> extends bsl<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bwk(int $$0) {
      super(ImmutableMap.of(bzw.aB, bzx.a, bzw.o, bzx.b, bzw.m, bzx.b, bzw.n, bzx.c, bzw.B, bzx.c, bzw.az, bzx.c, bzw.aG, bzx.c), $$0);
   }

   protected boolean a(apu $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apu $$0, E $$1, long $$2) {
      $$1.a(auo.By, 5.0F, 1.0F);
   }

   protected void c(apu $$0, E $$1, long $$2) {
      if ($$1.c(bre.m)) {
         $$1.b(bre.a);
      }

      $$1.dP().b(bzw.aB);
      $$1.dP().c(bzw.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dP().a(bzw.az)) {
            cjf.a($$1, $$1x.dm());
         }
      });
   }
}
