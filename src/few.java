public class few<T extends bjb> extends ffl<T> {
   public boolean a;
   public boolean b;

   public few(fhx $$0) {
      super($$0);
   }

   public static fid c() {
      float $$0 = -14.0F;
      fif $$1 = ffl.a(fib.a, -14.0F);
      fig $$2 = $$1.a();
      fhz $$3 = fhz.a(0.0F, -13.0F, 0.0F);
      $$2.a("hat", fic.c().a(0, 16).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fib(-0.5F)), $$3);
      $$2.a("head", fic.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), $$3);
      $$2.a("body", fic.c().a(32, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), fhz.a(0.0F, -14.0F, 0.0F));
      $$2.a("right_arm", fic.c().a(56, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), fhz.a(-5.0F, -12.0F, 0.0F));
      $$2.a("left_arm", fic.c().a(56, 0).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), fhz.a(5.0F, -12.0F, 0.0F));
      $$2.a("right_leg", fic.c().a(56, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), fhz.a(-2.0F, -5.0F, 0.0F));
      $$2.a("left_leg", fic.c().a(56, 0).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), fhz.a(2.0F, -5.0F, 0.0F));
      return fid.a($$1, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.k.k = true;
      int $$6 = -14;
      this.m.e = 0.0F;
      this.m.c = -14.0F;
      this.m.d = -0.0F;
      this.p.e -= 0.0F;
      this.q.e -= 0.0F;
      this.n.e *= 0.5F;
      this.o.e *= 0.5F;
      this.p.e *= 0.5F;
      this.q.e *= 0.5F;
      float $$7 = 0.4F;
      if (this.n.e > 0.4F) {
         this.n.e = 0.4F;
      }

      if (this.o.e > 0.4F) {
         this.o.e = 0.4F;
      }

      if (this.n.e < -0.4F) {
         this.n.e = -0.4F;
      }

      if (this.o.e < -0.4F) {
         this.o.e = -0.4F;
      }

      if (this.p.e > 0.4F) {
         this.p.e = 0.4F;
      }

      if (this.q.e > 0.4F) {
         this.q.e = 0.4F;
      }

      if (this.p.e < -0.4F) {
         this.p.e = -0.4F;
      }

      if (this.q.e < -0.4F) {
         this.q.e = -0.4F;
      }

      if (this.a) {
         this.n.e = -0.5F;
         this.o.e = -0.5F;
         this.n.g = 0.05F;
         this.o.g = -0.05F;
      }

      this.p.d = 0.0F;
      this.q.d = 0.0F;
      this.p.c = -5.0F;
      this.q.c = -5.0F;
      this.k.d = -0.0F;
      this.k.c = -13.0F;
      this.l.b = this.k.b;
      this.l.c = this.k.c;
      this.l.d = this.k.d;
      this.l.e = this.k.e;
      this.l.f = this.k.f;
      this.l.g = this.k.g;
      if (this.b) {
         float $$8 = 1.0F;
         this.k.c -= 5.0F;
      }

      int $$9 = -14;
      this.n.a(-5.0F, -12.0F, 0.0F);
      this.o.a(5.0F, -12.0F, 0.0F);
   }
}
