public class fpi extends fos {
   private boolean a;

   public fpi(int $$0, int $$1, fos.c $$2) {
      super($$0, $$1, 20, 20, wp.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xd d() {
      return wo.a(super.d(), this.a() ? wp.c("narrator.button.difficulty_lock.locked") : wp.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      fpi.a $$4;
      if (!this.j) {
         $$4 = this.a ? fpi.a.c : fpi.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fpi.a.b : fpi.a.e;
      } else {
         $$4 = this.a ? fpi.a.a : fpi.a.d;
      }

      $$0.a(gmh::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(akv.b("widget/locked_button")),
      b(akv.b("widget/locked_button_highlighted")),
      c(akv.b("widget/locked_button_disabled")),
      d(akv.b("widget/unlocked_button")),
      e(akv.b("widget/unlocked_button_highlighted")),
      f(akv.b("widget/unlocked_button_disabled"));

      final akv g;

      private a(final akv $$0) {
         this.g = $$0;
      }
   }
}
