public abstract class fsq extends fsy {
   protected static final int e = 2;
   private static final fun a = new fun(alg.b("widget/button"), alg.b("widget/button_disabled"), alg.b("widget/button_highlighted"));

   public fsq(int $$0, int $$1, int $$2, int $$3, wy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fsm $$0, int $$1, int $$2, float $$3) {
      fpt $$4 = fpt.Q();
      $$0.a(grc::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axw.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | azm.f(this.l * 255.0F) << 24);
   }

   public void a(fsm $$0, fsk $$1, int $$2) {
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
      } else if (fxc.a($$0)) {
         this.a(fpt.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
