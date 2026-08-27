public class fct extends fda {
   private exy a;

   public fct() {
      super(vf.c("outOfMemory.title"));
      this.a = exy.a;
   }

   @Override
   protected void aN_() {
      this.d(exf.a(ve.l, $$0 -> this.f.a(new fdf())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(exf.a(vf.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = exy.a(this.i, vf.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
