public abstract class foh extends fop {
   protected static final int e = 2;
   private static final fqf a = new fqf(akv.b("widget/button"), akv.b("widget/button_disabled"), akv.b("widget/button_highlighted"));

   public foh(int $$0, int $$1, int $$2, int $$3, wp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fod $$0, int $$1, int $$2, float $$3) {
      fli $$4 = fli.Q();
      $$0.a(gmh::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axk.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayz.f(this.l * 255.0F) << 24);
   }

   public void a(fod $$0, fob $$1, int $$2) {
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
      } else if (fsu.a($$0)) {
         this.a(fli.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
