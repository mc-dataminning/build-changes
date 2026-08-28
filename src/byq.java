import com.google.common.collect.ImmutableMap;

public class byq<E extends cll> extends bur<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public byq(int $$0) {
      super(ImmutableMap.of(ccc.aB, ccd.a, ccc.o, ccd.b, ccc.m, ccd.b, ccc.n, ccd.c, ccc.B, ccd.c, ccc.az, ccd.c, ccc.aG, ccd.c), $$0);
   }

   protected boolean a(aqk $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqk $$0, E $$1, long $$2) {
      $$1.a(avf.BU, 5.0F, 1.0F);
   }

   protected void c(aqk $$0, E $$1, long $$2) {
      if ($$1.c(btk.m)) {
         $$1.b(btk.a);
      }

      $$1.dT().b(ccc.aB);
      $$1.dT().c(ccc.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dT().a(ccc.az)) {
            clm.a($$1, $$1x.dp());
         }
      });
   }
}
