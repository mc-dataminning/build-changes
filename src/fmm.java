public class fmm extends fnj {
   private fil a;
   private final Runnable b;
   private final Runnable c;

   public fmm(Runnable $$0, Runnable $$1) {
      super(wu.c("datapackFailure.title"));
      this.a = fil.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a = fil.a(this.o, this.n(), this.m - 50);
      this.c(fhs.a(wu.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.m / 2 - 155, this.n / 6 + 96, 150, 20).a());
      this.c(fhs.a(wt.k, $$0 -> this.b.run()).a(this.m / 2 - 155 + 160, this.n / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
