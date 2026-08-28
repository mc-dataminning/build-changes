public abstract class frs extends fsa {
   protected static final int e = 2;
   private static final ftp a = new ftp(alg.b("widget/button"), alg.b("widget/button_disabled"), alg.b("widget/button_highlighted"));

   public frs(int $$0, int $$1, int $$2, int $$3, wy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fro $$0, int $$1, int $$2, float $$3) {
      fos $$4 = fos.Q();
      $$0.a(gqc::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axw.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azm.f(this.l * 255.0F) << 24);
   }

   public void a(fro $$0, frm $$1, int $$2) {
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
      } else if (fwe.a($$0)) {
         this.a(fos.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
