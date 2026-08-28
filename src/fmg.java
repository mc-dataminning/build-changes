public class fmg extends fnd {
   private fif a;
   private final Runnable b;
   private final Runnable c;

   public fmg(Runnable $$0, Runnable $$1) {
      super(wu.c("datapackFailure.title"));
      this.a = fif.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a = fif.a(this.o, this.n(), this.m - 50);
      this.c(fhm.a(wu.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.m / 2 - 155, this.n / 6 + 96, 150, 20).a());
      this.c(fhm.a(wt.k, $$0 -> this.b.run()).a(this.m / 2 - 155 + 160, this.n / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
