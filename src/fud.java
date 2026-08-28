public abstract class fud extends ful {
   protected static final int e = 2;
   private static final fwa a = new fwa(alk.b("widget/button"), alk.b("widget/button_disabled"), alk.b("widget/button_highlighted"));

   public fud(int $$0, int $$1, int $$2, int $$3, xc $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(ftz $$0, int $$1, int $$2, float $$3) {
      frf $$4 = frf.Q();
      $$0.a(gsn::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), aya.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azq.f(this.l * 255.0F) << 24);
   }

   public void a(ftz $$0, ftx $$1, int $$2) {
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
      } else if (fyp.a($$0)) {
         this.a(frf.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
