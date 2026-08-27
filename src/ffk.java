public class ffk extends feu {
   private boolean a;

   public ffk(int $$0, int $$1, feu.c $$2) {
      super($$0, $$1, 20, 20, ws.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xg aK_() {
      return wr.a(super.aK_(), this.a() ? ws.c("narrator.button.difficulty_lock.locked") : ws.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      ffk.a $$4;
      if (!this.j) {
         $$4 = this.a ? ffk.a.c : ffk.a.f;
      } else if (this.A()) {
         $$4 = this.a ? ffk.a.b : ffk.a.e;
      } else {
         $$4 = this.a ? ffk.a.a : ffk.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new akf("widget/locked_button")),
      b(new akf("widget/locked_button_highlighted")),
      c(new akf("widget/locked_button_disabled")),
      d(new akf("widget/unlocked_button")),
      e(new akf("widget/unlocked_button_highlighted")),
      f(new akf("widget/unlocked_button_disabled"));

      final akf g;

      private a(akf $$0) {
         this.g = $$0;
      }
   }
}
