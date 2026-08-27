public class fge extends fhh {
   private fcb a;
   private final Runnable b;
   private final Runnable c;

   public fge(Runnable $$0, Runnable $$1) {
      super(vu.c("datapackFailure.title"));
      this.a = fcb.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.a = fcb.a(this.i, this.p(), this.g - 50);
      this.c(fbi.a(vu.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.c(fbi.a(vt.k, $$0 -> this.b.run()).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aM_() {
      return false;
   }
}
