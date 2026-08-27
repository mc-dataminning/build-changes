public class fex extends ffe {
   private faa a;

   public fex() {
      super(vq.c("outOfMemory.title"));
      this.a = faa.a;
   }

   @Override
   protected void aQ_() {
      this.d(ezh.a(vp.l, $$0 -> this.f.a(new ffj())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(ezh.a(vq.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = faa.a(this.i, vq.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean aO_() {
      return false;
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
