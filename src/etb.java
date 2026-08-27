public class etb extends esl {
   private boolean a;

   public etb(int $$0, int $$1, esl.c $$2) {
      super($$0, $$1, 20, 20, ti.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected tv aA_() {
      return th.a(super.aA_(), this.a() ? ti.c("narrator.button.difficulty_lock.locked") : ti.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      etb.a $$4;
      if (!this.i) {
         $$4 = this.a ? etb.a.c : etb.a.f;
      } else if (this.o()) {
         $$4 = this.a ? etb.a.b : etb.a.e;
      } else {
         $$4 = this.a ? etb.a.a : etb.a.d;
      }

      $$0.a($$4.g, this.r(), this.t(), this.f, this.g);
   }

   static enum a {
      a(new aeu("widget/locked_button")),
      b(new aeu("widget/locked_button_highlighted")),
      c(new aeu("widget/locked_button_disabled")),
      d(new aeu("widget/unlocked_button")),
      e(new aeu("widget/unlocked_button_highlighted")),
      f(new aeu("widget/unlocked_button_disabled"));

      final aeu g;

      private a(aeu $$0) {
         this.g = $$0;
      }
   }
}
