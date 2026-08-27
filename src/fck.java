public class fck extends fdm {
   private eyk a;
   private final Runnable b;
   private final Runnable c;

   public fck(Runnable $$0, Runnable $$1) {
      super(vg.c("datapackFailure.title"));
      this.a = eyk.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a = eyk.a(this.i, this.p(), this.g - 50);
      this.d(exr.a(vg.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(exr.a(vf.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aN_() {
      return false;
   }
}
