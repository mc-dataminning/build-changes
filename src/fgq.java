public class fgq extends fga {
   private boolean a;

   public fgq(int $$0, int $$1, fga.c $$2) {
      super($$0, $$1, 20, 20, wx.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected xl aL_() {
      return ww.a(super.aL_(), this.a() ? wx.c("narrator.button.difficulty_lock.locked") : wx.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      fgq.a $$4;
      if (!this.j) {
         $$4 = this.a ? fgq.a.c : fgq.a.f;
      } else if (this.A()) {
         $$4 = this.a ? fgq.a.b : fgq.a.e;
      } else {
         $$4 = this.a ? fgq.a.a : fgq.a.d;
      }

      $$0.a($$4.g, this.C(), this.D(), this.g, this.h);
   }

   static enum a {
      a(new akn("widget/locked_button")),
      b(new akn("widget/locked_button_highlighted")),
      c(new akn("widget/locked_button_disabled")),
      d(new akn("widget/unlocked_button")),
      e(new akn("widget/unlocked_button_highlighted")),
      f(new akn("widget/unlocked_button_disabled"));

      final akn g;

      private a(akn $$0) {
         this.g = $$0;
      }
   }
}
