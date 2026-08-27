public class exd extends eyf {
   private ete a;
   private final Runnable b;

   public exd(Runnable $$0) {
      super(ti.c("datapackFailure.title"));
      this.a = ete.a;
      this.b = $$0;
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.a = ete.a(this.i, this.m(), this.g - 50);
      this.d(esl.a(ti.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(esl.a(th.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean at_() {
      return false;
   }
}
