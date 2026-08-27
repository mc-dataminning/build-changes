public class ezx extends ezh {
   private boolean a;

   public ezx(int $$0, int $$1, ezh.c $$2) {
      super($$0, $$1, 20, 20, vq.c("narrator.button.difficulty_lock"), $$2, p);
   }

   @Override
   protected we aN_() {
      return vp.a(super.aN_(), this.a() ? vq.c("narrator.button.difficulty_lock.locked") : vq.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      ezx.a $$4;
      if (!this.j) {
         $$4 = this.a ? ezx.a.c : ezx.a.f;
      } else if (this.z()) {
         $$4 = this.a ? ezx.a.b : ezx.a.e;
      } else {
         $$4 = this.a ? ezx.a.a : ezx.a.d;
      }

      $$0.a($$4.g, this.B(), this.C(), this.g, this.h);
   }

   static enum a {
      a(new aiy("widget/locked_button")),
      b(new aiy("widget/locked_button_highlighted")),
      c(new aiy("widget/locked_button_disabled")),
      d(new aiy("widget/unlocked_button")),
      e(new aiy("widget/unlocked_button_highlighted")),
      f(new aiy("widget/unlocked_button_disabled"));

      final aiy g;

      private a(aiy $$0) {
         this.g = $$0;
      }
   }
}
