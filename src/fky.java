public abstract class fky extends flf {
   protected static final int e = 2;
   private static final fmu a = new fmu(ali.b("widget/button"), ali.b("widget/button_disabled"), ali.b("widget/button_highlighted"));

   public fky(int $$0, int $$1, int $$2, int $$3, xi $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fku $$0, int $$1, int $$2, float $$3) {
      fji $$4 = fji.Q();
      $$0.a(gir::B, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), axv.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azk.f(this.l * 255.0F) << 24);
   }

   public void a(fku $$0, fks $$1, int $$2) {
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
      } else if (fpk.a($$0)) {
         this.a(fji.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
