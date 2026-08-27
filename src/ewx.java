public class ewx extends exz {
   private eta a;
   private final Runnable b;

   public ewx(Runnable $$0) {
      super(tf.c("datapackFailure.title"));
      this.a = eta.a;
      this.b = $$0;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.a = eta.a(this.i, this.m(), this.g - 50);
      this.d(esh.a(tf.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(esh.a(te.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aA_() {
      return false;
   }
}
