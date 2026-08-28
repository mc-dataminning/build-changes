public class fqg extends fpq {
   private boolean a;

   public fqg(int $$0, int $$1, fpq.c $$2) {
      super($$0, $$1, 20, 20, wp.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xd d() {
      return wo.a(super.d(), this.a() ? wp.c("narrator.button.difficulty_lock.locked") : wp.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      fqg.a $$4;
      if (!this.j) {
         $$4 = this.a ? fqg.a.c : fqg.a.f;
      } else if (this.D()) {
         $$4 = this.a ? fqg.a.b : fqg.a.e;
      } else {
         $$4 = this.a ? fqg.a.a : fqg.a.d;
      }

      $$0.a(gnh::H, $$4.g, this.F(), this.G(), this.g, this.h);
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
