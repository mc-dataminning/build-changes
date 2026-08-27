public class ffu extends ffe {
   private boolean a;

   public ffu(int $$0, int $$1, ffe.c $$2) {
      super($$0, $$1, 20, 20, wu.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xi aK_() {
      return wt.a(super.aK_(), this.a() ? wu.c("narrator.button.difficulty_lock.locked") : wu.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      ffu.a $$4;
      if (!this.j) {
         $$4 = this.a ? ffu.a.c : ffu.a.f;
      } else if (this.A()) {
         $$4 = this.a ? ffu.a.b : ffu.a.e;
      } else {
         $$4 = this.a ? ffu.a.a : ffu.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new akh("widget/locked_button")),
      b(new akh("widget/locked_button_highlighted")),
      c(new akh("widget/locked_button_disabled")),
      d(new akh("widget/unlocked_button")),
      e(new akh("widget/unlocked_button_highlighted")),
      f(new akh("widget/unlocked_button_disabled"));

      final akh g;

      private a(akh $$0) {
         this.g = $$0;
      }
   }
}
