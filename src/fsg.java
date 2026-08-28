public class fsg extends frq {
   private boolean a;

   public fsg(int $$0, int $$1, frq.c $$2) {
      super($$0, $$1, 20, 20, ww.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xk d() {
      return wv.a(super.d(), this.a() ? ww.c("narrator.button.difficulty_lock.locked") : ww.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      fsg.a $$4;
      if (!this.j) {
         $$4 = this.a ? fsg.a.c : fsg.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fsg.a.b : fsg.a.e;
      } else {
         $$4 = this.a ? fsg.a.a : fsg.a.d;
      }

      $$0.a(gpn::H, $$4.g, this.F(), this.G(), this.g, this.h);
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
