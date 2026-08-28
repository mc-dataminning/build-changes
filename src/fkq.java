public abstract class fkq extends fkx {
   protected static final int e = 2;
   private static final fmm a = new fmm(alh.b("widget/button"), alh.b("widget/button_disabled"), alh.b("widget/button_highlighted"));

   public fkq(int $$0, int $$1, int $$2, int $$3, xh $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fkm $$0, int $$1, int $$2, float $$3) {
      fja $$4 = fja.Q();
      $$0.a(gig::B, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), axu.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azj.f(this.l * 255.0F) << 24);
   }

   public void a(fkm $$0, fkk $$1, int $$2) {
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
      } else if (fpc.a($$0)) {
         this.a(fja.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
