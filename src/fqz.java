public class fqz extends frw {
   private fmw a;
   private final Runnable b;
   private final Runnable c;

   public fqz(Runnable $$0, Runnable $$1) {
      super(xj.c("datapackFailure.title"));
      this.a = fmw.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.a = fmw.a(this.p, this.n(), this.n - 50);
      this.c(fmd.a(xj.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(fmd.a(xi.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
