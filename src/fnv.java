public abstract class fnv extends foc {
   protected static final int e = 2;
   private static final fps a = new fps(alz.b("widget/button"), alz.b("widget/button_disabled"), alz.b("widget/button_highlighted"));

   public fnv(int $$0, int $$1, int $$2, int $$3, xv $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fnr $$0, int $$1, int $$2, float $$3) {
      fmf $$4 = fmf.Q();
      $$0.a(glu::C, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), ayp.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | bae.f(this.l * 255.0F) << 24);
   }

   public void a(fnr $$0, fnp $$1, int $$2) {
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
      } else if (fsh.a($$0)) {
         this.a(fmf.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
