public class fov extends foe {
   private boolean a;

   public fov(int $$0, int $$1, foe.c $$2) {
      super($$0, $$1, 20, 20, xv.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected yj aR_() {
      return xu.a(super.aR_(), this.a() ? xv.c("narrator.button.difficulty_lock.locked") : xv.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
      fov.a $$4;
      if (!this.j) {
         $$4 = this.a ? fov.a.c : fov.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fov.a.b : fov.a.e;
      } else {
         $$4 = this.a ? fov.a.a : fov.a.d;
      }

      $$0.a(glu::C, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(alz.b("widget/locked_button")),
      b(alz.b("widget/locked_button_highlighted")),
      c(alz.b("widget/locked_button_disabled")),
      d(alz.b("widget/unlocked_button")),
      e(alz.b("widget/unlocked_button_highlighted")),
      f(alz.b("widget/unlocked_button_disabled"));

      final alz g;

      private a(final alz $$0) {
         this.g = $$0;
      }
   }
}
