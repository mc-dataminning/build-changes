public class fbr extends fct {
   private exr a;
   private final Runnable b;
   private final Runnable c;

   public fbr(Runnable $$0, Runnable $$1) {
      super(vd.c("datapackFailure.title"));
      this.a = exr.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.a = exr.a(this.i, this.o(), this.g - 50);
      this.d(ewy.a(vd.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(ewy.a(vc.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aL_() {
      return false;
   }
}
