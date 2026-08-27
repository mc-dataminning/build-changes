public class eta extends esk {
   private boolean a;

   public eta(int $$0, int $$1, esk.c $$2) {
      super($$0, $$1, 20, 20, tl.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected tz aE_() {
      return tk.a(super.aE_(), this.a() ? tl.c("narrator.button.difficulty_lock.locked") : tl.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      eta.a $$4;
      if (!this.i) {
         $$4 = this.a ? eta.a.c : eta.a.f;
      } else if (this.o()) {
         $$4 = this.a ? eta.a.b : eta.a.e;
      } else {
         $$4 = this.a ? eta.a.a : eta.a.d;
      }

      $$0.a($$4.g, this.r(), this.t(), this.f, this.g);
   }

   static enum a {
      a(new aez("widget/locked_button")),
      b(new aez("widget/locked_button_highlighted")),
      c(new aez("widget/locked_button_disabled")),
      d(new aez("widget/unlocked_button")),
      e(new aez("widget/unlocked_button_highlighted")),
      f(new aez("widget/unlocked_button_disabled"));

      final aez g;

      private a(aez $$0) {
         this.g = $$0;
      }
   }
}
