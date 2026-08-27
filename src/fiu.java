public class fiu extends fjx {
   private fer a;
   private final Runnable b;
   private final Runnable c;

   public fiu(Runnable $$0, Runnable $$1) {
      super(wi.c("datapackFailure.title"));
      this.a = fer.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a = fer.a(this.m, this.n(), this.k - 50);
      this.c(fdy.a(wi.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.k / 2 - 155, this.l / 6 + 96, 150, 20).a());
      this.c(fdy.a(wh.k, $$0 -> this.b.run()).a(this.k / 2 - 155 + 160, this.l / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.k / 2, 70);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
