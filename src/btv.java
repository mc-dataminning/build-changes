import com.google.common.collect.ImmutableMap;

public class btv<E extends cgl> extends bpw<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public btv(int $$0) {
      super(ImmutableMap.of(bxh.aB, bxi.a, bxh.o, bxi.b, bxh.m, bxi.b, bxh.n, bxi.c, bxh.B, bxi.c, bxh.az, bxi.c, bxh.aG, bxi.c), $$0);
   }

   protected boolean a(aov $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aov $$0, E $$1, long $$2) {
      $$1.a(atk.AZ, 5.0F, 1.0F);
   }

   protected void c(aov $$0, E $$1, long $$2) {
      if ($$1.c(bor.m)) {
         $$1.b(bor.a);
      }

      $$1.dO().b(bxh.aB);
      $$1.dO().c(bxh.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dO().a(bxh.az)) {
            cgm.a($$1, $$1x.dm());
         }
      });
   }
}
