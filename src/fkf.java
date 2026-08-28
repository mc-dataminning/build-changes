public abstract class fkf extends fkm {
   protected static final int e = 2;
   private static final fmb a = new fmb(ale.b("widget/button"), ale.b("widget/button_disabled"), ale.b("widget/button_highlighted"));

   public fkf(int $$0, int $$1, int $$2, int $$3, xe $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fkb $$0, int $$1, int $$2, float $$3) {
      fip $$4 = fip.Q();
      $$0.a(ghv::B, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), axq.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azf.f(this.l * 255.0F) << 24);
   }

   public void a(fkb $$0, fjz $$1, int $$2) {
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
      } else if (foq.a($$0)) {
         this.a(fip.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
