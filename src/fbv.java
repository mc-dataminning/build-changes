public class fbv extends fcc {
   private exa a;

   public fbv() {
      super(vb.c("outOfMemory.title"));
      this.a = exa.a;
   }

   @Override
   protected void aP_() {
      this.d(ewh.a(va.l, $$0 -> this.f.a(new fch())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(ewh.a(vb.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = exa.a(this.i, vb.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
