public class fmb extends fne {
   private fhy a;
   private final Runnable b;
   private final Runnable c;

   public fmb(Runnable $$0, Runnable $$1) {
      super(xp.c("datapackFailure.title"));
      this.a = fhy.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a = fhy.a(this.p, this.n(), this.n - 50);
      this.c(fhf.a(xp.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(fhf.a(xo.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
