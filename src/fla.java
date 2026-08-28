public class fla extends fkk {
   private boolean a;

   public fla(int $$0, int $$1, fkk.c $$2) {
      super($$0, $$1, 20, 20, xd.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xr aO_() {
      return xc.a(super.aO_(), this.a() ? xd.c("narrator.button.difficulty_lock.locked") : xd.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      fla.a $$4;
      if (!this.j) {
         $$4 = this.a ? fla.a.c : fla.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fla.a.b : fla.a.e;
      } else {
         $$4 = this.a ? fla.a.a : fla.a.d;
      }

      $$0.a(ghq::B, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(alc.b("widget/locked_button")),
      b(alc.b("widget/locked_button_highlighted")),
      c(alc.b("widget/locked_button_disabled")),
      d(alc.b("widget/unlocked_button")),
      e(alc.b("widget/unlocked_button_highlighted")),
      f(alc.b("widget/unlocked_button_disabled"));

      final alc g;

      private a(final alc $$0) {
         this.g = $$0;
      }
   }
}
