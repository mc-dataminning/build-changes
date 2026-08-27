public class eyc extends ezd {
   private euc a;
   private final Runnable b;

   public eyc(Runnable $$0) {
      super(ui.c("datapackFailure.title"));
      this.a = euc.a;
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a = euc.a(this.i, this.m(), this.g - 50);
      this.d(etj.a(ui.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(etj.a(uh.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aB_() {
      return false;
   }
}
