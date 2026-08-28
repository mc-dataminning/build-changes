import com.google.common.collect.ImmutableMap;

public class cbt<E extends cov> extends bxu<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cbt(int $$0) {
      super(ImmutableMap.of(cff.aB, cfg.a, cff.o, cfg.b, cff.m, cfg.b, cff.n, cfg.c, cff.B, cfg.c, cff.az, cfg.c, cff.aG, cfg.c), $$0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, E $$1, long $$2) {
      $$1.a(axf.Ct, 5.0F, 1.0F);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.c(bwn.m)) {
         $$1.b(bwn.a);
      }

      $$1.eb().b(cff.aB);
      $$1.eb().c(cff.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cff.az)) {
            cow.a($$1, $$1x.dv());
         }
      });
   }
}
