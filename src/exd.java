public class exd extends eye {
   private etd a;
   private final Runnable b;

   public exd(Runnable $$0) {
      super(tl.c("datapackFailure.title"));
      this.a = etd.a;
      this.b = $$0;
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.a = etd.a(this.i, this.m(), this.g - 50);
      this.d(esk.a(tl.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(esk.a(tk.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
