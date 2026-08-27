public class fcs extends fcz {
   private exx a;

   public fcs() {
      super(vf.c("outOfMemory.title"));
      this.a = exx.a;
   }

   @Override
   protected void aN_() {
      this.d(exe.a(ve.l, $$0 -> this.f.a(new fde())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(exe.a(vf.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = exx.a(this.i, vf.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
