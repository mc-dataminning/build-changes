import com.google.common.collect.ImmutableMap;

public class cbp<E extends cor> extends bxq<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cbp(int $$0) {
      super(ImmutableMap.of(cfb.aB, cfc.a, cfb.o, cfc.b, cfb.m, cfc.b, cfb.n, cfc.c, cfb.B, cfc.c, cfb.az, cfc.c, cfb.aG, cfc.c), $$0);
   }

   protected boolean a(arx $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arx $$0, E $$1, long $$2) {
      $$1.a(awv.CK, 5.0F, 1.0F);
   }

   protected void c(arx $$0, E $$1, long $$2) {
      if ($$1.c(bwj.m)) {
         $$1.b(bwj.a);
      }

      $$1.ec().b(cfb.aB);
      $$1.ec().c(cfb.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cfb.az)) {
            cos.a($$1, $$1x.dw());
         }
      });
   }
}
