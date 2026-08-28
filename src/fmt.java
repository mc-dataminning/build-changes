public class fmt extends fmd {
   private boolean a;

   public fmt(int $$0, int $$1, fmd.c $$2) {
      super($$0, $$1, 20, 20, xj.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xx aN_() {
      return xi.a(super.aN_(), this.a() ? xj.c("narrator.button.difficulty_lock.locked") : xj.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      fmt.a $$4;
      if (!this.j) {
         $$4 = this.a ? fmt.a.c : fmt.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fmt.a.b : fmt.a.e;
      } else {
         $$4 = this.a ? fmt.a.a : fmt.a.d;
      }

      $$0.a(gjq::B, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(alj.b("widget/locked_button")),
      b(alj.b("widget/locked_button_highlighted")),
      c(alj.b("widget/locked_button_disabled")),
      d(alj.b("widget/unlocked_button")),
      e(alj.b("widget/unlocked_button_highlighted")),
      f(alj.b("widget/unlocked_button_disabled"));

      final alj g;

      private a(final alj $$0) {
         this.g = $$0;
      }
   }
}
