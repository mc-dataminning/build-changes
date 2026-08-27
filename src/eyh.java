public class eyh extends exr {
   private boolean a;

   public eyh(int $$0, int $$1, exr.c $$2) {
      super($$0, $$1, 20, 20, vg.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vu aM_() {
      return vf.a(super.aM_(), this.a() ? vg.c("narrator.button.difficulty_lock.locked") : vg.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      eyh.a $$4;
      if (!this.j) {
         $$4 = this.a ? eyh.a.c : eyh.a.f;
      } else if (this.z()) {
         $$4 = this.a ? eyh.a.b : eyh.a.e;
      } else {
         $$4 = this.a ? eyh.a.a : eyh.a.d;
      }

      $$0.a($$4.g, this.B(), this.C(), this.g, this.h);
   }

   static enum a {
      a(new ahh("widget/locked_button")),
      b(new ahh("widget/locked_button_highlighted")),
      c(new ahh("widget/locked_button_disabled")),
      d(new ahh("widget/unlocked_button")),
      e(new ahh("widget/unlocked_button_highlighted")),
      f(new ahh("widget/unlocked_button_disabled"));

      final ahh g;

      private a(ahh $$0) {
         this.g = $$0;
      }
   }
}
