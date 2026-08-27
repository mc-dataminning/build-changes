public class eyx extends ezd {
   private euc a;

   public eyx() {
      super(ui.c("outOfMemory.title"));
      this.a = euc.a;
   }

   @Override
   protected void aM_() {
      this.d(etj.a(uh.l, $$0 -> this.f.a(new ezi())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(etj.a(ui.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = euc.a(this.i, ui.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aB_() {
      return false;
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
