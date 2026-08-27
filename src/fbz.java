public class fbz extends fdb {
   private exz a;
   private final Runnable b;
   private final Runnable c;

   public fbz(Runnable $$0, Runnable $$1) {
      super(vf.c("datapackFailure.title"));
      this.a = exz.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.a = exz.a(this.i, this.o(), this.g - 50);
      this.d(exg.a(vf.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(exg.a(ve.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aL_() {
      return false;
   }
}
