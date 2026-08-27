public class evc extends eum {
   private boolean a;

   public evc(int $$0, int $$1, eum.c $$2) {
      super($$0, $$1, 20, 20, ur.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected vf aL_() {
      return uq.a(super.aL_(), this.a() ? ur.c("narrator.button.difficulty_lock.locked") : ur.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      evc.a $$4;
      if (!this.i) {
         $$4 = this.a ? evc.a.c : evc.a.f;
      } else if (this.n()) {
         $$4 = this.a ? evc.a.b : evc.a.e;
      } else {
         $$4 = this.a ? evc.a.a : evc.a.d;
      }

      $$0.a($$4.g, this.p(), this.r(), this.f, this.g);
   }

   static enum a {
      a(new agg("widget/locked_button")),
      b(new agg("widget/locked_button_highlighted")),
      c(new agg("widget/locked_button_disabled")),
      d(new agg("widget/unlocked_button")),
      e(new agg("widget/unlocked_button_highlighted")),
      f(new agg("widget/unlocked_button_disabled"));

      final agg g;

      private a(agg $$0) {
         this.g = $$0;
      }
   }
}
