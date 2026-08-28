import com.google.common.collect.ImmutableMap;

public class byv extends bxu<bwd> {
   public static final int c = 100;
   private final bsp d;
   private final axe e;

   public byv(bsp $$0, axe $$1) {
      super(ImmutableMap.of(cff.n, cfg.c, cff.T, cfg.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ash $$0, bwd $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(ash $$0, bwd $$1, long $$2) {
      $$1.r(true);
      $$1.b(bwn.g);
   }

   protected void c(ash $$0, bwd $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.h($$1.dy().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, axg.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bwn.a);
      $$1.eb().b(cff.T);
      $$1.eb().a(cff.S, this.d.a($$0.A));
   }
}
