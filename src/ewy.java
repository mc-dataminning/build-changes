public class ewy extends eya {
   private esz a;
   private final Runnable b;

   public ewy(Runnable $$0) {
      super(tf.c("datapackFailure.title"));
      this.a = esz.a;
      this.b = $$0;
   }

   @Override
   protected void aC_() {
      super.aC_();
      this.a = esz.a(this.i, this.m(), this.g - 50);
      this.d(esg.a(tf.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(esg.a(te.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
