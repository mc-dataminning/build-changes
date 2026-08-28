public abstract class fln extends flu {
   protected static final int e = 2;
   private static final fnj a = new fnj(all.b("widget/button"), all.b("widget/button_disabled"), all.b("widget/button_highlighted"));

   public fln(int $$0, int $$1, int $$2, int $$3, xl $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(flj $$0, int $$1, int $$2, float $$3) {
      fjx $$4 = fjx.Q();
      $$0.a(gjh::B, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), axy.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azn.f(this.l * 255.0F) << 24);
   }

   public void a(flj $$0, flh $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.j || !this.k) {
         return false;
      } else if (fpz.a($$0)) {
         this.a(fjx.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
