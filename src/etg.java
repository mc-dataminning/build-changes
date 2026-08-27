public class etg extends esq {
   private boolean a;

   public etg(int $$0, int $$1, esq.c $$2) {
      super($$0, $$1, 20, 20, tm.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected tz aF_() {
      return tl.a(super.aF_(), this.a() ? tm.c("narrator.button.difficulty_lock.locked") : tm.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      etg.a $$4;
      if (!this.i) {
         $$4 = this.a ? etg.a.c : etg.a.f;
      } else if (this.o()) {
         $$4 = this.a ? etg.a.b : etg.a.e;
      } else {
         $$4 = this.a ? etg.a.a : etg.a.d;
      }

      $$0.a($$4.g, this.r(), this.t(), this.f, this.g);
   }

   static enum a {
      a(new aex("widget/locked_button")),
      b(new aex("widget/locked_button_highlighted")),
      c(new aex("widget/locked_button_disabled")),
      d(new aex("widget/unlocked_button")),
      e(new aex("widget/unlocked_button_highlighted")),
      f(new aex("widget/unlocked_button_disabled"));

      final aex g;

      private a(aex $$0) {
         this.g = $$0;
      }
   }
}
