public class fil extends fjo {
   private fei a;
   private final Runnable b;
   private final Runnable c;

   public fil(Runnable $$0, Runnable $$1) {
      super(wg.c("datapackFailure.title"));
      this.a = fei.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.a = fei.a(this.m, this.n(), this.k - 50);
      this.c(fdp.a(wg.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.k / 2 - 155, this.l / 6 + 96, 150, 20).a());
      this.c(fdp.a(wf.k, $$0 -> this.b.run()).a(this.k / 2 - 155 + 160, this.l / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.k / 2, 70);
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
