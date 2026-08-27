public class esy extends esi {
   private boolean a;

   public esy(int $$0, int $$1, esi.c $$2) {
      super($$0, $$1, 20, 20, te.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected tr aB_() {
      return td.a(super.aB_(), this.a() ? te.c("narrator.button.difficulty_lock.locked") : te.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      esy.a $$4;
      if (!this.i) {
         $$4 = this.a ? esy.a.c : esy.a.f;
      } else if (this.n()) {
         $$4 = this.a ? esy.a.b : esy.a.e;
      } else {
         $$4 = this.a ? esy.a.a : esy.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new aep("widget/locked_button")),
      b(new aep("widget/locked_button_highlighted")),
      c(new aep("widget/locked_button_disabled")),
      d(new aep("widget/unlocked_button")),
      e(new aep("widget/unlocked_button_highlighted")),
      f(new aep("widget/unlocked_button_disabled"));

      final aep g;

      private a(aep $$0) {
         this.g = $$0;
      }
   }
}
