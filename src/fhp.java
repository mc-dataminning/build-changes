public class fhp extends fgz {
   private boolean a;

   public fhp(int $$0, int $$1, fgz.c $$2) {
      super($$0, $$1, 20, 20, xl.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xz aL_() {
      return xk.a(super.aL_(), this.a() ? xl.c("narrator.button.difficulty_lock.locked") : xl.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      fhp.a $$4;
      if (!this.j) {
         $$4 = this.a ? fhp.a.c : fhp.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fhp.a.b : fhp.a.e;
      } else {
         $$4 = this.a ? fhp.a.a : fhp.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new alb("widget/locked_button")),
      b(new alb("widget/locked_button_highlighted")),
      c(new alb("widget/locked_button_disabled")),
      d(new alb("widget/unlocked_button")),
      e(new alb("widget/unlocked_button_highlighted")),
      f(new alb("widget/unlocked_button_disabled"));

      final alb g;

      private a(final alb $$0) {
         this.g = $$0;
      }
   }
}
