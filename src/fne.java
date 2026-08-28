public class fne extends fob {
   private fjd a;
   private final Runnable b;
   private final Runnable c;

   public fne(Runnable $$0, Runnable $$1) {
      super(wz.c("datapackFailure.title"));
      this.a = fjd.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.a = fjd.a(this.o, this.n(), this.m - 50);
      this.c(fik.a(wz.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.m / 2 - 155, this.n / 6 + 96, 150, 20).a());
      this.c(fik.a(wy.k, $$0 -> this.b.run()).a(this.m / 2 - 155 + 160, this.n / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aJ_() {
      return false;
   }
}
