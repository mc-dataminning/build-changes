public class etg extends esq {
   private boolean a;

   public etg(int $$0, int $$1, esq.c $$2) {
      super($$0, $$1, 20, 20, tl.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected ty aE_() {
      return tk.a(super.aE_(), this.a() ? tl.c("narrator.button.difficulty_lock.locked") : tl.c("narrator.button.difficulty_lock.unlocked"));
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
      a(new aew("widget/locked_button")),
      b(new aew("widget/locked_button_highlighted")),
      c(new aew("widget/locked_button_disabled")),
      d(new aew("widget/unlocked_button")),
      e(new aew("widget/unlocked_button_highlighted")),
      f(new aew("widget/unlocked_button_disabled"));

      final aew g;

      private a(aew $$0) {
         this.g = $$0;
      }
   }
}
