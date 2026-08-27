public class fga extends fgh {
   private fbd a;

   public fga() {
      super(vs.c("outOfMemory.title"));
      this.a = fbd.a;
   }

   @Override
   protected void aP_() {
      this.c(fak.a(vr.l, $$0 -> this.f.a(new fgm())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.c(fak.a(vs.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = fbd.a(this.i, vs.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
