public class ewx extends ewh {
   private boolean a;

   public ewx(int $$0, int $$1, ewh.c $$2) {
      super($$0, $$1, 20, 20, vb.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vp aM_() {
      return va.a(super.aM_(), this.a() ? vb.c("narrator.button.difficulty_lock.locked") : vb.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      ewx.a $$4;
      if (!this.i) {
         $$4 = this.a ? ewx.a.c : ewx.a.f;
      } else if (this.n()) {
         $$4 = this.a ? ewx.a.b : ewx.a.e;
      } else {
         $$4 = this.a ? ewx.a.a : ewx.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new agt("widget/locked_button")),
      b(new agt("widget/locked_button_highlighted")),
      c(new agt("widget/locked_button_disabled")),
      d(new agt("widget/unlocked_button")),
      e(new agt("widget/unlocked_button_highlighted")),
      f(new agt("widget/unlocked_button_disabled"));

      final agt g;

      private a(agt $$0) {
         this.g = $$0;
      }
   }
}
