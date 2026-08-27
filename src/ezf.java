public class ezf extends fah {
   private evf a;
   private final Runnable b;
   private final Runnable c;

   public ezf(Runnable $$0, Runnable $$1) {
      super(ur.c("datapackFailure.title"));
      this.a = evf.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a = evf.a(this.i, this.m(), this.g - 50);
      this.d(eum.a(ur.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(eum.a(uq.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
