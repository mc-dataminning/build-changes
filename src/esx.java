public class esx extends esh {
   private boolean a;

   public esx(int $$0, int $$1, esh.c $$2) {
      super($$0, $$1, 20, 20, tf.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected ts aB_() {
      return te.a(super.aB_(), this.a() ? tf.c("narrator.button.difficulty_lock.locked") : tf.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      esx.a $$4;
      if (!this.i) {
         $$4 = this.a ? esx.a.c : esx.a.f;
      } else if (this.n()) {
         $$4 = this.a ? esx.a.b : esx.a.e;
      } else {
         $$4 = this.a ? esx.a.a : esx.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new aer("widget/locked_button")),
      b(new aer("widget/locked_button_highlighted")),
      c(new aer("widget/locked_button_disabled")),
      d(new aer("widget/unlocked_button")),
      e(new aer("widget/unlocked_button_highlighted")),
      f(new aer("widget/unlocked_button_disabled"));

      final aer g;

      private a(aer $$0) {
         this.g = $$0;
      }
   }
}
