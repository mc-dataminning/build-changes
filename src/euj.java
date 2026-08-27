public class euj extends euq {
   private epz a;

   public euj() {
      super(sw.c("outOfMemory.title"));
      this.a = epz.a;
   }

   @Override
   protected void b() {
      this.d(epi.a(sv.l, $$0 -> this.f.a(new euw())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(epi.a(sw.c("menu.quit"), $$0 -> this.f.p()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = epz.a(this.i, sw.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean av_() {
      return false;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
      super.a($$0, $$1, $$2, $$3);
   }
}
