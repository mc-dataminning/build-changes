import com.google.common.collect.ImmutableMap;

public class byi<E extends clc> extends buj<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public byi(int $$0) {
      super(ImmutableMap.of(cbu.aB, cbv.a, cbu.o, cbv.b, cbu.m, cbv.b, cbu.n, cbv.c, cbu.B, cbv.c, cbu.az, cbv.c, cbu.aG, cbv.c), $$0);
   }

   protected boolean a(aqn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqn $$0, E $$1, long $$2) {
      $$1.a(avi.BR, 5.0F, 1.0F);
   }

   protected void c(aqn $$0, E $$1, long $$2) {
      if ($$1.c(btc.m)) {
         $$1.b(btc.a);
      }

      $$1.dS().b(cbu.aB);
      $$1.dS().c(cbu.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(cbu.az)) {
            cld.a($$1, $$1x.dp());
         }
      });
   }
}
