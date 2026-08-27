import com.google.common.collect.ImmutableMap;

public class btz<E extends cgp> extends bqa<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public btz(int $$0) {
      super(ImmutableMap.of(bxl.aB, bxm.a, bxl.o, bxm.b, bxl.m, bxm.b, bxl.n, bxm.c, bxl.B, bxm.c, bxl.az, bxm.c, bxl.aG, bxm.c), $$0);
   }

   protected boolean a(aow $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aow $$0, E $$1, long $$2) {
      $$1.a(atl.Ba, 5.0F, 1.0F);
   }

   protected void c(aow $$0, E $$1, long $$2) {
      if ($$1.c(bot.m)) {
         $$1.b(bot.a);
      }

      $$1.dO().b(bxl.aB);
      $$1.dO().c(bxl.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dO().a(bxl.az)) {
            cgq.a($$1, $$1x.dm());
         }
      });
   }
}
