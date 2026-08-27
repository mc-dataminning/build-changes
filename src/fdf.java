public class fdf extends fdm {
   private eyk a;

   public fdf() {
      super(vg.c("outOfMemory.title"));
      this.a = eyk.a;
   }

   @Override
   protected void aP_() {
      this.d(exr.a(vf.l, $$0 -> this.f.a(new fdr())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(exr.a(vg.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = eyk.a(this.i, vg.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
