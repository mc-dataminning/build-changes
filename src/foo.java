public class foo extends fny {
   private boolean a;

   public foo(int $$0, int $$1, fny.c $$2) {
      super($$0, $$1, 20, 20, xk.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xy aR_() {
      return xj.a(super.aR_(), this.a() ? xk.c("narrator.button.difficulty_lock.locked") : xk.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      foo.a $$4;
      if (!this.j) {
         $$4 = this.a ? foo.a.c : foo.a.f;
      } else if (this.B()) {
         $$4 = this.a ? foo.a.b : foo.a.e;
      } else {
         $$4 = this.a ? foo.a.a : foo.a.d;
      }

      $$0.a(glq::H, $$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(alp.b("widget/locked_button")),
      b(alp.b("widget/locked_button_highlighted")),
      c(alp.b("widget/locked_button_disabled")),
      d(alp.b("widget/unlocked_button")),
      e(alp.b("widget/unlocked_button_highlighted")),
      f(alp.b("widget/unlocked_button_disabled"));

      final alp g;

      private a(final alp $$0) {
         this.g = $$0;
      }
   }
}
