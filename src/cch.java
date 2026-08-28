import com.google.common.collect.ImmutableMap;

public class cch<E extends cpl> extends byi<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cch(int $$0) {
      super(ImmutableMap.of(cft.aC, cfu.a, cft.p, cfu.b, cft.n, cfu.b, cft.o, cfu.c, cft.C, cfu.c, cft.aA, cfu.c, cft.aH, cfu.c), $$0);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arn $$0, E $$1, long $$2) {
      $$1.a(awk.CT, 5.0F, 1.0F);
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if ($$1.c(bxd.m)) {
         $$1.b(bxd.a);
      }

      $$1.eb().b(cft.aC);
      $$1.eb().c(cft.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cft.aA)) {
            cpm.a($$1, $$1x.dv());
         }
      });
   }
}
