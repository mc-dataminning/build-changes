import com.google.common.collect.ImmutableMap;

public class cay<E extends cny> extends bwz<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cay(int $$0) {
      super(ImmutableMap.of(cek.aB, cel.a, cek.o, cel.b, cek.m, cel.b, cek.n, cel.c, cek.B, cel.c, cek.az, cel.c, cek.aG, cel.c), $$0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ard $$0, E $$1, long $$2) {
      $$1.a(awa.CJ, 5.0F, 1.0F);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.c(bvs.m)) {
         $$1.b(bvs.a);
      }

      $$1.eb().b(cek.aB);
      $$1.eb().c(cek.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cek.az)) {
            cnz.a($$1, $$1x.dv());
         }
      });
   }
}
