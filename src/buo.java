import com.google.common.collect.ImmutableMap;

public class buo<E extends che> extends bqp<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public buo(int $$0) {
      super(ImmutableMap.of(bya.aB, byb.a, bya.o, byb.b, bya.m, byb.b, bya.n, byb.c, bya.B, byb.c, bya.az, byb.c, bya.aG, byb.c), $$0);
   }

   protected boolean a(apa $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(apa $$0, E $$1, long $$2) {
      $$1.a(atp.Bn, 5.0F, 1.0F);
   }

   protected void c(apa $$0, E $$1, long $$2) {
      if ($$1.c(bpi.m)) {
         $$1.b(bpi.a);
      }

      $$1.dM().b(bya.aB);
      $$1.dM().c(bya.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dM().a(bya.az)) {
            chf.a($$1, $$1x.dj());
         }
      });
   }
}
