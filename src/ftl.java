public class ftl extends fsv {
   private boolean a;

   public ftl(int $$0, int $$1, fsv.c $$2) {
      super($$0, $$1, 20, 20, wy.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xm d() {
      return wx.a(super.d(), this.a() ? wy.c("narrator.button.difficulty_lock.locked") : wy.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      ftl.a $$4;
      if (!this.j) {
         $$4 = this.a ? ftl.a.c : ftl.a.f;
      } else if (this.D()) {
         $$4 = this.a ? ftl.a.b : ftl.a.e;
      } else {
         $$4 = this.a ? ftl.a.a : ftl.a.d;
      }

      $$0.a(gqx::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(alg.b("widget/locked_button")),
      b(alg.b("widget/locked_button_highlighted")),
      c(alg.b("widget/locked_button_disabled")),
      d(alg.b("widget/unlocked_button")),
      e(alg.b("widget/unlocked_button_highlighted")),
      f(alg.b("widget/unlocked_button_disabled"));

      final alg g;

      private a(final alg $$0) {
         this.g = $$0;
      }
   }
}
