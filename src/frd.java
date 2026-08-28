public class frd extends fqn {
   private boolean a;

   public frd(int $$0, int $$1, fqn.c $$2) {
      super($$0, $$1, 20, 20, wv.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xj d() {
      return wu.a(super.d(), this.a() ? wv.c("narrator.button.difficulty_lock.locked") : wv.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      frd.a $$4;
      if (!this.j) {
         $$4 = this.a ? frd.a.c : frd.a.f;
      } else if (this.D()) {
         $$4 = this.a ? frd.a.b : frd.a.e;
      } else {
         $$4 = this.a ? frd.a.a : frd.a.d;
      }

      $$0.a(goi::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(ald.b("widget/locked_button")),
      b(ald.b("widget/locked_button_highlighted")),
      c(ald.b("widget/locked_button_disabled")),
      d(ald.b("widget/unlocked_button")),
      e(ald.b("widget/unlocked_button_highlighted")),
      f(ald.b("widget/unlocked_button_disabled"));

      final ald g;

      private a(final ald $$0) {
         this.g = $$0;
      }
   }
}
