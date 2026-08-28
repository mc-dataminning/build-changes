public class fhv extends fhf {
   private boolean a;

   public fhv(int $$0, int $$1, fhf.c $$2) {
      super($$0, $$1, 20, 20, xp.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected yd aJ_() {
      return xo.a(super.aJ_(), this.a() ? xp.c("narrator.button.difficulty_lock.locked") : xp.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      fhv.a $$4;
      if (!this.j) {
         $$4 = this.a ? fhv.a.c : fhv.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fhv.a.b : fhv.a.e;
      } else {
         $$4 = this.a ? fhv.a.a : fhv.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new alf("widget/locked_button")),
      b(new alf("widget/locked_button_highlighted")),
      c(new alf("widget/locked_button_disabled")),
      d(new alf("widget/unlocked_button")),
      e(new alf("widget/unlocked_button_highlighted")),
      f(new alf("widget/unlocked_button_disabled"));

      final alf g;

      private a(final alf $$0) {
         this.g = $$0;
      }
   }
}
