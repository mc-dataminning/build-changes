public class exu extends exe {
   private boolean a;

   public exu(int $$0, int $$1, exe.c $$2) {
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
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      exu.a $$4;
      if (!this.j) {
         $$4 = this.a ? exu.a.c : exu.a.f;
      } else if (this.z()) {
         $$4 = this.a ? exu.a.b : exu.a.e;
      } else {
         $$4 = this.a ? exu.a.a : exu.a.d;
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
