public class fmm extends flw {
   private boolean a;

   public fmm(int $$0, int $$1, flw.c $$2) {
      super($$0, $$1, 20, 20, xl.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xz aO_() {
      return xk.a(super.aO_(), this.a() ? xl.c("narrator.button.difficulty_lock.locked") : xl.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      fmm.a $$4;
      if (!this.j) {
         $$4 = this.a ? fmm.a.c : fmm.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fmm.a.b : fmm.a.e;
      } else {
         $$4 = this.a ? fmm.a.a : fmm.a.d;
      }

      $$0.a(gjh::B, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(all.b("widget/locked_button")),
      b(all.b("widget/locked_button_highlighted")),
      c(all.b("widget/locked_button_disabled")),
      d(all.b("widget/unlocked_button")),
      e(all.b("widget/unlocked_button_highlighted")),
      f(all.b("widget/unlocked_button_disabled"));

      final all g;

      private a(final all $$0) {
         this.g = $$0;
      }
   }
}
