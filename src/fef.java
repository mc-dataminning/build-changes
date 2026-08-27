public class fef extends fdp {
   private boolean a;

   public fef(int $$0, int $$1, fdp.c $$2) {
      super($$0, $$1, 20, 20, wg.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected wu aL_() {
      return wf.a(super.aL_(), this.a() ? wg.c("narrator.button.difficulty_lock.locked") : wg.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      fef.a $$4;
      if (!this.j) {
         $$4 = this.a ? fef.a.c : fef.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fef.a.b : fef.a.e;
      } else {
         $$4 = this.a ? fef.a.a : fef.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new ajt("widget/locked_button")),
      b(new ajt("widget/locked_button_highlighted")),
      c(new ajt("widget/locked_button_disabled")),
      d(new ajt("widget/unlocked_button")),
      e(new ajt("widget/unlocked_button_highlighted")),
      f(new ajt("widget/unlocked_button_disabled"));

      final ajt g;

      private a(ajt $$0) {
         this.g = $$0;
      }
   }
}
