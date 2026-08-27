public class fha extends fhh {
   private fcb a;

   public fha() {
      super(vu.c("outOfMemory.title"));
      this.a = fcb.a;
   }

   @Override
   protected void aO_() {
      this.c(fbi.a(vt.l, $$0 -> this.f.a(new fhm())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.c(fbi.a(vu.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = fcb.a(this.i, vu.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aM_() {
      return false;
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
