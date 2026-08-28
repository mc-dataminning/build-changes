public abstract class fkb extends fki {
   protected static final int e = 2;
   private static final flx a = new flx(alc.b("widget/button"), alc.b("widget/button_disabled"), alc.b("widget/button_highlighted"));

   public fkb(int $$0, int $$1, int $$2, int $$3, xd $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fjx $$0, int $$1, int $$2, float $$3) {
      fil $$4 = fil.Q();
      $$0.a(ghq::B, a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w(), axo.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azd.f(this.l * 255.0F) << 24);
   }

   public void a(fjx $$0, fjv $$1, int $$2) {
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
      } else if (fom.a($$0)) {
         this.a(fil.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
