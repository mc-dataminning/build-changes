public class fjd extends fin {
   private boolean a;

   public fjd(int $$0, int $$1, fin.c $$2) {
      super($$0, $$1, 20, 20, xe.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xs aK_() {
      return xd.a(super.aK_(), this.a() ? xe.c("narrator.button.difficulty_lock.locked") : xe.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      fjd.a $$4;
      if (!this.j) {
         $$4 = this.a ? fjd.a.c : fjd.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fjd.a.b : fjd.a.e;
      } else {
         $$4 = this.a ? fjd.a.a : fjd.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new akt("widget/locked_button")),
      b(new akt("widget/locked_button_highlighted")),
      c(new akt("widget/locked_button_disabled")),
      d(new akt("widget/unlocked_button")),
      e(new akt("widget/unlocked_button_highlighted")),
      f(new akt("widget/unlocked_button_disabled"));

      final akt g;

      private a(akt $$0) {
         this.g = $$0;
      }
   }
}
