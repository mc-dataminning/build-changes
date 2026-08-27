public class fba extends fcc {
   private exa a;
   private final Runnable b;
   private final Runnable c;

   public fba(Runnable $$0, Runnable $$1) {
      super(vb.c("datapackFailure.title"));
      this.a = exa.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a = exa.a(this.i, this.m(), this.g - 50);
      this.d(ewh.a(vb.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(ewh.a(va.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
