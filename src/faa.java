public class faa extends fah {
   private evf a;

   public faa() {
      super(ur.c("outOfMemory.title"));
      this.a = evf.a;
   }

   @Override
   protected void aO_() {
      this.d(eum.a(uq.l, $$0 -> this.f.a(new fam())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(eum.a(ur.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = evf.a(this.i, ur.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
