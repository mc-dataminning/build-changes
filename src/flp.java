public class flp extends fkz {
   private boolean a;

   public flp(int $$0, int $$1, fkz.c $$2) {
      super($$0, $$1, 20, 20, xh.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xv aP_() {
      return xg.a(super.aP_(), this.a() ? xh.c("narrator.button.difficulty_lock.locked") : xh.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      flp.a $$4;
      if (!this.j) {
         $$4 = this.a ? flp.a.c : flp.a.f;
      } else if (this.B()) {
         $$4 = this.a ? flp.a.b : flp.a.e;
      } else {
         $$4 = this.a ? flp.a.a : flp.a.d;
      }

      $$0.a(gig::B, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(alh.b("widget/locked_button")),
      b(alh.b("widget/locked_button_highlighted")),
      c(alh.b("widget/locked_button_disabled")),
      d(alh.b("widget/unlocked_button")),
      e(alh.b("widget/unlocked_button_highlighted")),
      f(alh.b("widget/unlocked_button_disabled"));

      final alh g;

      private a(final alh $$0) {
         this.g = $$0;
      }
   }
}
