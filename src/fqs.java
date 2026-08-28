public class fqs extends frp {
   private fmp a;
   private final Runnable b;
   private final Runnable c;

   public fqs(Runnable $$0, Runnable $$1) {
      super(xl.c("datapackFailure.title"));
      this.a = fmp.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.a = fmp.a(this.p, this.n(), this.n - 50);
      this.c(flw.a(xl.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(flw.a(xk.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
