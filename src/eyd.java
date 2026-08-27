public class eyd extends eyk {
   private etj a;

   public eyd() {
      super(tl.c("outOfMemory.title"));
      this.a = etj.a;
   }

   @Override
   protected void aI_() {
      this.d(esq.a(tk.l, $$0 -> this.f.a(new eyp())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(esq.a(tl.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = etj.a(this.i, tl.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
