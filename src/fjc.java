public class fjc extends fim {
   private boolean a;

   public fjc(int $$0, int $$1, fim.c $$2) {
      super($$0, $$1, 20, 20, wz.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xn aQ_() {
      return wy.a(super.aQ_(), this.a() ? wz.c("narrator.button.difficulty_lock.locked") : wz.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      fjc.a $$4;
      if (!this.j) {
         $$4 = this.a ? fjc.a.c : fjc.a.f;
      } else if (this.B()) {
         $$4 = this.a ? fjc.a.b : fjc.a.e;
      } else {
         $$4 = this.a ? fjc.a.a : fjc.a.d;
      }

      $$0.a($$4.g, this.D(), this.E(), this.g, this.h);
   }

   static enum a {
      a(akr.b("widget/locked_button")),
      b(akr.b("widget/locked_button_highlighted")),
      c(akr.b("widget/locked_button_disabled")),
      d(akr.b("widget/unlocked_button")),
      e(akr.b("widget/unlocked_button_highlighted")),
      f(akr.b("widget/unlocked_button_disabled"));

      final akr g;

      private a(final akr $$0) {
         this.g = $$0;
      }
   }
}
