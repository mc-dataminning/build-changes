public abstract class fto extends ftw {
   protected static final int e = 2;
   private static final fvl a = new fvl(alr.b("widget/button"), alr.b("widget/button_disabled"), alr.b("widget/button_highlighted"));

   public fto(int $$0, int $$1, int $$2, int $$3, xg $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(ftk $$0, int $$1, int $$2, float $$3) {
      fqq $$4 = fqq.Q();
      $$0.a(gry::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), ayh.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azz.f(this.l * 255.0F) << 24);
   }

   public void a(ftk $$0, fti $$1, int $$2) {
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
      } else if (fya.a($$0)) {
         this.a(fqq.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
