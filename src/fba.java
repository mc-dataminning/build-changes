public class fba extends fak {
   private boolean a;

   public fba(int $$0, int $$1, fak.c $$2) {
      super($$0, $$1, 20, 20, vs.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected wg aM_() {
      return vr.a(super.aM_(), this.a() ? vs.c("narrator.button.difficulty_lock.locked") : vs.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      fba.a $$4;
      if (!this.j) {
         $$4 = this.a ? fba.a.c : fba.a.f;
      } else if (this.z()) {
         $$4 = this.a ? fba.a.b : fba.a.e;
      } else {
         $$4 = this.a ? fba.a.a : fba.a.d;
      }

      $$0.a($$4.g, this.B(), this.C(), this.g, this.h);
   }

   static enum a {
      a(new ajc("widget/locked_button")),
      b(new ajc("widget/locked_button_highlighted")),
      c(new ajc("widget/locked_button_disabled")),
      d(new ajc("widget/unlocked_button")),
      e(new ajc("widget/unlocked_button_highlighted")),
      f(new ajc("widget/unlocked_button_disabled"));

      final ajc g;

      private a(ajc $$0) {
         this.g = $$0;
      }
   }
}
