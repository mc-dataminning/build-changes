public class fii extends fhs {
   private boolean a;

   public fii(int $$0, int $$1, fhs.c $$2) {
      super($$0, $$1, 20, 20, wu.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xi aM_() {
      return wt.a(super.aM_(), this.a() ? wu.c("narrator.button.difficulty_lock.locked") : wu.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      fii.a $$4;
      if (!this.j) {
         $$4 = this.a ? fii.a.c : fii.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fii.a.b : fii.a.e;
      } else {
         $$4 = this.a ? fii.a.a : fii.a.d;
      }

      $$0.a($$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(new akk("widget/locked_button")),
      b(new akk("widget/locked_button_highlighted")),
      c(new akk("widget/locked_button_disabled")),
      d(new akk("widget/unlocked_button")),
      e(new akk("widget/unlocked_button_highlighted")),
      f(new akk("widget/unlocked_button_disabled"));

      final akk g;

      private a(final akk $$0) {
         this.g = $$0;
      }
   }
}
