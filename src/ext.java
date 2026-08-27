public class ext extends eya {
   private esz a;

   public ext() {
      super(tf.c("outOfMemory.title"));
      this.a = esz.a;
   }

   @Override
   protected void aC_() {
      this.d(esg.a(te.l, $$0 -> this.f.a(new eyf())).a(this.g / 2 - 155, this.h / 4 + 120 + 12, 150, 20).a());
      this.d(esg.a(tf.c("menu.quit"), $$0 -> this.f.q()).a(this.g / 2 - 155 + 160, this.h / 4 + 120 + 12, 150, 20).a());
      this.a = esz.a(this.i, tf.c("outOfMemory.message"), 295);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 4 - 60 + 20, 16777215);
      this.a.b($$0, this.g / 2 - 145, this.h / 4, 9, 10526880);
   }
}
