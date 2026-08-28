public class fkq extends fka {
   private boolean a;

   public fkq(int $$0, int $$1, fka.c $$2) {
      super($$0, $$1, 20, 20, xd.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xr aQ_() {
      return xc.a(super.aQ_(), this.a() ? xd.c("narrator.button.difficulty_lock.locked") : xd.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      fkq.a $$4;
      if (!this.j) {
         $$4 = this.a ? fkq.a.c : fkq.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fkq.a.b : fkq.a.e;
      } else {
         $$4 = this.a ? fkq.a.a : fkq.a.d;
      }

      $$0.a(ghe::C, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(alb.b("widget/locked_button")),
      b(alb.b("widget/locked_button_highlighted")),
      c(alb.b("widget/locked_button_disabled")),
      d(alb.b("widget/unlocked_button")),
      e(alb.b("widget/unlocked_button_highlighted")),
      f(alb.b("widget/unlocked_button_disabled"));

      final alb g;

      private a(final alb $$0) {
         this.g = $$0;
      }
   }
}
