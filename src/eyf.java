public class eyf extends eym {
   private etl a;

   public eyf() {
      super(tn.c("outOfMemory.title"));
      this.a = etl.a;
   }

   @Override
   protected void aH_() {
      this.d(ess.a(tm.l, $$0 -> this.f.a(new eyr())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(ess.a(tn.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = etl.a(this.i, tn.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
