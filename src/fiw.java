public class fiw extends fig {
   private boolean a;

   public fiw(int $$0, int $$1, fig.c $$2) {
      super($$0, $$1, 20, 20, wy.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xm aM_() {
      return wx.a(super.aM_(), this.a() ? wy.c("narrator.button.difficulty_lock.locked") : wy.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      fiw.a $$4;
      if (!this.j) {
         $$4 = this.a ? fiw.a.c : fiw.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fiw.a.b : fiw.a.e;
      } else {
         $$4 = this.a ? fiw.a.a : fiw.a.d;
      }

      $$0.a($$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(akq.b("widget/locked_button")),
      b(akq.b("widget/locked_button_highlighted")),
      c(akq.b("widget/locked_button_disabled")),
      d(akq.b("widget/unlocked_button")),
      e(akq.b("widget/unlocked_button_highlighted")),
      f(akq.b("widget/unlocked_button_disabled"));

      final akq g;

      private a(final akq $$0) {
         this.g = $$0;
      }
   }
}
