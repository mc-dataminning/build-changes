public class fle extends fko {
   private boolean a;

   public fle(int $$0, int $$1, fko.c $$2) {
      super($$0, $$1, 20, 20, xe.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xs aP_() {
      return xd.a(super.aP_(), this.a() ? xe.c("narrator.button.difficulty_lock.locked") : xe.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      fle.a $$4;
      if (!this.j) {
         $$4 = this.a ? fle.a.c : fle.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fle.a.b : fle.a.e;
      } else {
         $$4 = this.a ? fle.a.a : fle.a.d;
      }

      $$0.a(ghv::B, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(ale.b("widget/locked_button")),
      b(ale.b("widget/locked_button_highlighted")),
      c(ale.b("widget/locked_button_disabled")),
      d(ale.b("widget/unlocked_button")),
      e(ale.b("widget/unlocked_button_highlighted")),
      f(ale.b("widget/unlocked_button_disabled"));

      final ale g;

      private a(final ale $$0) {
         this.g = $$0;
      }
   }
}
