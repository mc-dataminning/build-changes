public class exy extends eyf {
   private ete a;

   public exy() {
      super(ti.c("outOfMemory.title"));
      this.a = ete.a;
   }

   @Override
   protected void aD_() {
      this.d(esl.a(th.l, $$0 -> this.f.a(new eyk())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(esl.a(ti.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = ete.a(this.i, ti.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean at_() {
      return false;
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
