public class fhs extends fhc {
   private boolean a;

   public fhs(int $$0, int $$1, fhc.c $$2) {
      super($$0, $$1, 20, 20, xo.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected yc aK_() {
      return xn.a(super.aK_(), this.a() ? xo.c("narrator.button.difficulty_lock.locked") : xo.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      fhs.a $$4;
      if (!this.j) {
         $$4 = this.a ? fhs.a.c : fhs.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fhs.a.b : fhs.a.e;
      } else {
         $$4 = this.a ? fhs.a.a : fhs.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new ale("widget/locked_button")),
      b(new ale("widget/locked_button_highlighted")),
      c(new ale("widget/locked_button_disabled")),
      d(new ale("widget/unlocked_button")),
      e(new ale("widget/unlocked_button_highlighted")),
      f(new ale("widget/unlocked_button_disabled"));

      final ale g;

      private a(final ale $$0) {
         this.g = $$0;
      }
   }
}
