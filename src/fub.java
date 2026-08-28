public abstract class fub extends fuj {
   protected static final int e = 2;
   private static final fvy a = new fvy(ali.b("widget/button"), ali.b("widget/button_disabled"), ali.b("widget/button_highlighted"));

   public fub(int $$0, int $$1, int $$2, int $$3, xa $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(ftx $$0, int $$1, int $$2, float $$3) {
      frd $$4 = frd.Q();
      $$0.a(gsl::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axy.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azo.f(this.l * 255.0F) << 24);
   }

   public void a(ftx $$0, ftv $$1, int $$2) {
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
      } else if (fyn.a($$0)) {
         this.a(frd.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
