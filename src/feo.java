public class feo extends fdy {
   private boolean a;

   public feo(int $$0, int $$1, fdy.c $$2) {
      super($$0, $$1, 20, 20, wi.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected ww aK_() {
      return wh.a(super.aK_(), this.a() ? wi.c("narrator.button.difficulty_lock.locked") : wi.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      feo.a $$4;
      if (!this.j) {
         $$4 = this.a ? feo.a.c : feo.a.f;
      } else if (this.A()) {
         $$4 = this.a ? feo.a.b : feo.a.e;
      } else {
         $$4 = this.a ? feo.a.a : feo.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new ajv("widget/locked_button")),
      b(new ajv("widget/locked_button_highlighted")),
      c(new ajv("widget/locked_button_disabled")),
      d(new ajv("widget/unlocked_button")),
      e(new ajv("widget/unlocked_button_highlighted")),
      f(new ajv("widget/unlocked_button_disabled"));

      final ajv g;

      private a(ajv $$0) {
         this.g = $$0;
      }
   }
}
