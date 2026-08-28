import com.google.common.collect.ImmutableMap;

public class cbq<E extends cou> extends bxr<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cbq(int $$0) {
      super(ImmutableMap.of(cfc.aB, cfd.a, cfc.o, cfd.b, cfc.m, cfd.b, cfc.n, cfd.c, cfc.B, cfd.c, cfc.az, cfd.c, cfc.aG, cfd.c), $$0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.a(awa.CT, 5.0F, 1.0F);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.c(bwk.m)) {
         $$1.b(bwk.a);
      }

      $$1.ea().b(cfc.aB);
      $$1.ea().c(cfc.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ea().a(cfc.az)) {
            cov.a($$1, $$1x.du());
         }
      });
   }
}
