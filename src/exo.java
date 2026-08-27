public class exo extends ewy {
   private boolean a;

   public exo(int $$0, int $$1, ewy.c $$2) {
      super($$0, $$1, 20, 20, vd.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vr aK_() {
      return vc.a(super.aK_(), this.a() ? vd.c("narrator.button.difficulty_lock.locked") : vd.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      exo.a $$4;
      if (!this.j) {
         $$4 = this.a ? exo.a.c : exo.a.f;
      } else if (this.z()) {
         $$4 = this.a ? exo.a.b : exo.a.e;
      } else {
         $$4 = this.a ? exo.a.a : exo.a.d;
      }

      $$0.a($$4.g, this.B(), this.C(), this.g, this.h);
   }

   static enum a {
      a(new ahd("widget/locked_button")),
      b(new ahd("widget/locked_button_highlighted")),
      c(new ahd("widget/locked_button_disabled")),
      d(new ahd("widget/unlocked_button")),
      e(new ahd("widget/unlocked_button_highlighted")),
      f(new ahd("widget/unlocked_button_disabled"));

      final ahd g;

      private a(ahd $$0) {
         this.g = $$0;
      }
   }
}
