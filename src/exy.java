public class exy extends eye {
   private etd a;

   public exy() {
      super(tl.c("outOfMemory.title"));
      this.a = etd.a;
   }

   @Override
   protected void aH_() {
      this.d(esk.a(tk.l, $$0 -> this.f.a(new eyj())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(esk.a(tl.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = etd.a(this.i, tl.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
