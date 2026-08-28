import com.google.common.collect.ImmutableMap;

public class byz extends bxu<cpe> {
   private final float c;

   public byz(float $$0) {
      super(ImmutableMap.of(cff.m, cfg.c, cff.n, cfg.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ash $$0, cpe $$1) {
      cps $$2 = $$1.gm();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(ash $$0, cpe $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ash $$0, cpe $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      bxd<?> $$3 = $$1.eb();
      $$3.b(cff.m);
      $$3.b(cff.n);
   }

   protected void d(ash $$0, cpe $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cpe $$0) {
      bxd<?> $$1 = $$0.eb();
      $$1.a(cff.m, new cfi(new byf($$0.gm(), false), this.c, 2));
      $$1.a(cff.n, new byf($$0.gm(), true));
   }
}
