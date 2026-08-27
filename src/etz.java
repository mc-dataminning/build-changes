public class etz extends etj {
   private boolean a;

   public etz(int $$0, int $$1, etj.c $$2) {
      super($$0, $$1, 20, 20, ui.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected uw aI_() {
      return uh.a(super.aI_(), this.a() ? ui.c("narrator.button.difficulty_lock.locked") : ui.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      etz.a $$4;
      if (!this.i) {
         $$4 = this.a ? etz.a.c : etz.a.f;
      } else if (this.n()) {
         $$4 = this.a ? etz.a.b : etz.a.e;
      } else {
         $$4 = this.a ? etz.a.a : etz.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new afw("widget/locked_button")),
      b(new afw("widget/locked_button_highlighted")),
      c(new afw("widget/locked_button_disabled")),
      d(new afw("widget/unlocked_button")),
      e(new afw("widget/unlocked_button_highlighted")),
      f(new afw("widget/unlocked_button_disabled"));

      final afw g;

      private a(afw $$0) {
         this.g = $$0;
      }
   }
}
