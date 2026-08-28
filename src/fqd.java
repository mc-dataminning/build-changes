public abstract class fqd extends fql {
   protected static final int e = 2;
   private static final fsa a = new fsa(ald.b("widget/button"), ald.b("widget/button_disabled"), ald.b("widget/button_highlighted"));

   public fqd(int $$0, int $$1, int $$2, int $$3, wv $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fpz $$0, int $$1, int $$2, float $$3) {
      fnd $$4 = fnd.Q();
      $$0.a(goi::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axu.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azk.f(this.l * 255.0F) << 24);
   }

   public void a(fpz $$0, fpx $$1, int $$2) {
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
      } else if (fup.a($$0)) {
         this.a(fnd.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
