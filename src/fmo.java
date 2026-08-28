public class fmo extends fnl {
   private fin a;
   private final Runnable b;
   private final Runnable c;

   public fmo(Runnable $$0, Runnable $$1) {
      super(wu.c("datapackFailure.title"));
      this.a = fin.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a = fin.a(this.o, this.n(), this.m - 50);
      this.c(fhu.a(wu.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.m / 2 - 155, this.n / 6 + 96, 150, 20).a());
      this.c(fhu.a(wt.k, $$0 -> this.b.run()).a(this.m / 2 - 155 + 160, this.n / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
