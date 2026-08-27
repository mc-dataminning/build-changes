public class exv extends exf {
   private boolean a;

   public exv(int $$0, int $$1, exf.c $$2) {
      super($$0, $$1, 20, 20, vf.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vt aK_() {
      return ve.a(super.aK_(), this.a() ? vf.c("narrator.button.difficulty_lock.locked") : vf.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      exv.a $$4;
      if (!this.j) {
         $$4 = this.a ? exv.a.c : exv.a.f;
      } else if (this.z()) {
         $$4 = this.a ? exv.a.b : exv.a.e;
      } else {
         $$4 = this.a ? exv.a.a : exv.a.d;
      }

      $$0.a($$4.g, this.B(), this.C(), this.g, this.h);
   }

   static enum a {
      a(new ahg("widget/locked_button")),
      b(new ahg("widget/locked_button_highlighted")),
      c(new ahg("widget/locked_button_disabled")),
      d(new ahg("widget/unlocked_button")),
      e(new ahg("widget/unlocked_button_highlighted")),
      f(new ahg("widget/unlocked_button_disabled"));

      final ahg g;

      private a(ahg $$0) {
         this.g = $$0;
      }
   }
}
