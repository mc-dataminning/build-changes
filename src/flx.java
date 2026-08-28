public class flx extends flh {
   private boolean a;

   public flx(int $$0, int $$1, flh.c $$2) {
      super($$0, $$1, 20, 20, xi.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xw aO_() {
      return xh.a(super.aO_(), this.a() ? xi.c("narrator.button.difficulty_lock.locked") : xi.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      flx.a $$4;
      if (!this.j) {
         $$4 = this.a ? flx.a.c : flx.a.f;
      } else if (this.B()) {
         $$4 = this.a ? flx.a.b : flx.a.e;
      } else {
         $$4 = this.a ? flx.a.a : flx.a.d;
      }

      $$0.a(gir::B, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(ali.b("widget/locked_button")),
      b(ali.b("widget/locked_button_highlighted")),
      c(ali.b("widget/locked_button_disabled")),
      d(ali.b("widget/unlocked_button")),
      e(ali.b("widget/unlocked_button_highlighted")),
      f(ali.b("widget/unlocked_button_disabled"));

      final ali g;

      private a(final ali $$0) {
         this.g = $$0;
      }
   }
}
