public class fsu extends ftr {
   private fos a;
   private final Runnable b;
   private final Runnable c;

   public fsu(Runnable $$0, Runnable $$1) {
      super(xk.c("datapackFailure.title"));
      this.a = fos.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a = fos.a(this.p, this.m(), this.n - 50);
      this.c(fny.a(xk.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(fny.a(xj.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
