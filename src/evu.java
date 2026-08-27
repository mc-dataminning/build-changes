public class evu extends eve {
   private boolean a;

   public evu(int $$0, int $$1, eve.c $$2) {
      super($$0, $$1, 20, 20, uv.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vj aN_() {
      return uu.a(super.aN_(), this.a() ? uv.c("narrator.button.difficulty_lock.locked") : uv.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      evu.a $$4;
      if (!this.i) {
         $$4 = this.a ? evu.a.c : evu.a.f;
      } else if (this.n()) {
         $$4 = this.a ? evu.a.b : evu.a.e;
      } else {
         $$4 = this.a ? evu.a.a : evu.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new agm("widget/locked_button")),
      b(new agm("widget/locked_button_highlighted")),
      c(new agm("widget/locked_button_disabled")),
      d(new agm("widget/unlocked_button")),
      e(new agm("widget/unlocked_button_highlighted")),
      f(new agm("widget/unlocked_button_disabled"));

      final agm g;

      private a(agm $$0) {
         this.g = $$0;
      }
   }
}
