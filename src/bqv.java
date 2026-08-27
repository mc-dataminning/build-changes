import com.google.common.collect.ImmutableMap;

public class bqv<E extends ccy> extends bmx<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bqv(int $$0) {
      super(ImmutableMap.of(buh.aA, bui.a, buh.o, bui.b, buh.m, bui.b, buh.n, bui.c, buh.B, bui.c, buh.ay, bui.c, buh.aF, bui.c), $$0);
   }

   protected boolean a(ame $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ame $$0, E $$1, long $$2) {
      $$1.a(aqr.Ap, 5.0F, 1.0F);
   }

   protected void c(ame $$0, E $$1, long $$2) {
      if ($$1.c(bls.m)) {
         $$1.b(bls.a);
      }

      $$1.dP().b(buh.aA);
      $$1.dP().c(buh.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dP().a(buh.ay)) {
            ccz.a($$1, $$1x.dn());
         }
      });
   }
}
