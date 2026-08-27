public class fby extends fbi {
   private boolean a;

   public fby(int $$0, int $$1, fbi.c $$2) {
      super($$0, $$1, 20, 20, vu.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected wi aL_() {
      return vt.a(super.aL_(), this.a() ? vu.c("narrator.button.difficulty_lock.locked") : vu.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      fby.a $$4;
      if (!this.j) {
         $$4 = this.a ? fby.a.c : fby.a.f;
      } else if (this.z()) {
         $$4 = this.a ? fby.a.b : fby.a.e;
      } else {
         $$4 = this.a ? fby.a.a : fby.a.d;
      }

      $$0.a($$4.g, this.B(), this.C(), this.g, this.h);
   }

   static enum a {
      a(new ajh("widget/locked_button")),
      b(new ajh("widget/locked_button_highlighted")),
      c(new ajh("widget/locked_button_disabled")),
      d(new ajh("widget/unlocked_button")),
      e(new ajh("widget/unlocked_button_highlighted")),
      f(new ajh("widget/unlocked_button_disabled"));

      final ajh g;

      private a(ajh $$0) {
         this.g = $$0;
      }
   }
}
