public abstract class foi extends foq {
   protected static final int e = 2;
   private static final fqg a = new fqg(akv.b("widget/button"), akv.b("widget/button_disabled"), akv.b("widget/button_highlighted"));

   public foi(int $$0, int $$1, int $$2, int $$3, wp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(foe $$0, int $$1, int $$2, float $$3) {
      flj $$4 = flj.Q();
      $$0.a(gmi::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axk.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayz.f(this.l * 255.0F) << 24);
   }

   public void a(foe $$0, foc $$1, int $$2) {
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
      } else if (fsv.a($$0)) {
         this.a(flj.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
