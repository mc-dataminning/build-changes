import com.google.common.collect.ImmutableMap;

public class bwv<E extends cjp> extends bsw<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bwv(int $$0) {
      super(ImmutableMap.of(cah.aB, cai.a, cah.o, cai.b, cah.m, cai.b, cah.n, cai.c, cah.B, cai.c, cah.az, cai.c, cah.aG, cai.c), $$0);
   }

   protected boolean a(aqe $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqe $$0, E $$1, long $$2) {
      $$1.a(auz.BF, 5.0F, 1.0F);
   }

   protected void c(aqe $$0, E $$1, long $$2) {
      if ($$1.c(brp.m)) {
         $$1.b(brp.a);
      }

      $$1.dQ().b(cah.aB);
      $$1.dQ().c(cah.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dQ().a(cah.az)) {
            cjq.a($$1, $$1x.dn());
         }
      });
   }
}
