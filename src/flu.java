public abstract class flu extends fmb {
   protected static final int e = 2;
   private static final fnq a = new fnq(alj.b("widget/button"), alj.b("widget/button_disabled"), alj.b("widget/button_highlighted"));

   public flu(int $$0, int $$1, int $$2, int $$3, xj $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(flq $$0, int $$1, int $$2, float $$3) {
      fke $$4 = fke.Q();
      $$0.a(gjq::B, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), axx.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azm.f(this.l * 255.0F) << 24);
   }

   public void a(flq $$0, flo $$1, int $$2) {
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
      } else if (fqg.a($$0)) {
         this.a(fke.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
