public class exk extends eym {
   private etl a;
   private final Runnable b;

   public exk(Runnable $$0) {
      super(tn.c("datapackFailure.title"));
      this.a = etl.a;
      this.b = $$0;
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.a = etl.a(this.i, this.m(), this.g - 50);
      this.d(ess.a(tn.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(ess.a(tm.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
