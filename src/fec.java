public class fec extends ffe {
   private faa a;
   private final Runnable b;
   private final Runnable c;

   public fec(Runnable $$0, Runnable $$1) {
      super(vq.c("datapackFailure.title"));
      this.a = faa.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.a = faa.a(this.i, this.p(), this.g - 50);
      this.d(ezh.a(vq.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(ezh.a(vp.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aO_() {
      return false;
   }
}
