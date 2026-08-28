public class fpg extends fop {
   private boolean a;

   public fpg(int $$0, int $$1, fop.c $$2) {
      super($$0, $$1, 20, 20, wo.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xc d() {
      return wn.a(super.d(), this.a() ? wo.c("narrator.button.difficulty_lock.locked") : wo.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      fpg.a $$4;
      if (!this.j) {
         $$4 = this.a ? fpg.a.c : fpg.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fpg.a.b : fpg.a.e;
      } else {
         $$4 = this.a ? fpg.a.a : fpg.a.d;
      }

      $$0.a(gmf::H, $$4.g, this.F(), this.G(), this.g, this.h);
   }

   static enum a {
      a(aku.b("widget/locked_button")),
      b(aku.b("widget/locked_button_highlighted")),
      c(aku.b("widget/locked_button_disabled")),
      d(aku.b("widget/unlocked_button")),
      e(aku.b("widget/unlocked_button_highlighted")),
      f(aku.b("widget/unlocked_button_disabled"));

      final aku g;

      private a(final aku $$0) {
         this.g = $$0;
      }
   }
}
