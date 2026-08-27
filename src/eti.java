public class eti extends ess {
   private boolean a;

   public eti(int $$0, int $$1, ess.c $$2) {
      super($$0, $$1, 20, 20, tn.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected ua aE_() {
      return tm.a(super.aE_(), this.a() ? tn.c("narrator.button.difficulty_lock.locked") : tn.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      eti.a $$4;
      if (!this.i) {
         $$4 = this.a ? eti.a.c : eti.a.f;
      } else if (this.o()) {
         $$4 = this.a ? eti.a.b : eti.a.e;
      } else {
         $$4 = this.a ? eti.a.a : eti.a.d;
      }

      $$0.a($$4.g, this.r(), this.t(), this.f, this.g);
   }

   static enum a {
      a(new aey("widget/locked_button")),
      b(new aey("widget/locked_button_highlighted")),
      c(new aey("widget/locked_button_disabled")),
      d(new aey("widget/unlocked_button")),
      e(new aey("widget/unlocked_button_highlighted")),
      f(new aey("widget/unlocked_button_disabled"));

      final aey g;

      private a(aey $$0) {
         this.g = $$0;
      }
   }
}
