public class esw extends esg {
   private boolean a;

   public esw(int $$0, int $$1, esg.c $$2) {
      super($$0, $$1, 20, 20, tf.c("narrator.button.difficulty_lock"), $$2, o);
   }

   @Override
   protected ts az_() {
      return te.a(super.az_(), this.a() ? tf.c("narrator.button.difficulty_lock.locked") : tf.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      esw.a $$4;
      if (!this.i) {
         $$4 = this.a ? esw.a.c : esw.a.f;
      } else if (this.o()) {
         $$4 = this.a ? esw.a.b : esw.a.e;
      } else {
         $$4 = this.a ? esw.a.a : esw.a.d;
      }

      $$0.a($$4.g, this.r(), this.t(), this.f, this.g);
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
