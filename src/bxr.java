import com.google.common.collect.ImmutableMap;

public class bxr<E extends ckl> extends bts<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bxr(int $$0) {
      super(ImmutableMap.of(cbd.aB, cbe.a, cbd.o, cbe.b, cbd.m, cbe.b, cbd.n, cbe.c, cbd.B, cbe.c, cbd.az, cbe.c, cbd.aG, cbe.c), $$0);
   }

   protected boolean a(aqh $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqh $$0, E $$1, long $$2) {
      $$1.a(avc.BG, 5.0F, 1.0F);
   }

   protected void c(aqh $$0, E $$1, long $$2) {
      if ($$1.c(bsl.m)) {
         $$1.b(bsl.a);
      }

      $$1.dQ().b(cbd.aB);
      $$1.dQ().c(cbd.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dQ().a(cbd.az)) {
            ckm.a($$1, $$1x.dn());
         }
      });
   }
}
