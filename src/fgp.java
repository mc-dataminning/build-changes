public class fgp extends ffz {
   private boolean a;

   public fgp(int $$0, int $$1, ffz.c $$2) {
      super($$0, $$1, 20, 20, wx.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xl aK_() {
      return ww.a(super.aK_(), this.a() ? wx.c("narrator.button.difficulty_lock.locked") : wx.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      fgp.a $$4;
      if (!this.j) {
         $$4 = this.a ? fgp.a.c : fgp.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fgp.a.b : fgp.a.e;
      } else {
         $$4 = this.a ? fgp.a.a : fgp.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new akm("widget/locked_button")),
      b(new akm("widget/locked_button_highlighted")),
      c(new akm("widget/locked_button_disabled")),
      d(new akm("widget/unlocked_button")),
      e(new akm("widget/unlocked_button_highlighted")),
      f(new akm("widget/unlocked_button_disabled"));

      final akm g;

      private a(akm $$0) {
         this.g = $$0;
      }
   }
}
