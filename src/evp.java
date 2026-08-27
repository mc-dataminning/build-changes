public class evp extends euz {
   private boolean a;

   public evp(int $$0, int $$1, euz.c $$2) {
      super($$0, $$1, 20, 20, ur.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vf aM_() {
      return uq.a(super.aM_(), this.a() ? ur.c("narrator.button.difficulty_lock.locked") : ur.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      evp.a $$4;
      if (!this.i) {
         $$4 = this.a ? evp.a.c : evp.a.f;
      } else if (this.n()) {
         $$4 = this.a ? evp.a.b : evp.a.e;
      } else {
         $$4 = this.a ? evp.a.a : evp.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new agi("widget/locked_button")),
      b(new agi("widget/locked_button_highlighted")),
      c(new agi("widget/locked_button_disabled")),
      d(new agi("widget/unlocked_button")),
      e(new agi("widget/unlocked_button_highlighted")),
      f(new agi("widget/unlocked_button_disabled"));

      final agi g;

      private a(agi $$0) {
         this.g = $$0;
      }
   }
}
