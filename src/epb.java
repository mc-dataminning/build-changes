public abstract class epb extends epf implements eqh, eqt {
   private static final int a = -1;
   private static final int b = -6250336;
   private static final int c = -16777216;
   private static final int d = 4;
   private double e;
   private boolean f;

   public epb(int $$0, int $$1, int $$2, int $$3, sw $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (!this.s) {
         return false;
      } else {
         boolean $$3 = this.c($$0, $$1);
         boolean $$4 = this.e()
            && $$0 >= (double)(this.p() + this.o)
            && $$0 <= (double)(this.p() + this.o + 8)
            && $$1 >= (double)this.r()
            && $$1 < (double)(this.r() + this.p);
         if ($$4 && $$2 == 0) {
            this.f = true;
            return true;
         } else {
            return $$3 || $$4;
         }
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         this.f = false;
      }

      return super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.s && this.aB_() && this.f) {
         if ($$1 < (double)this.r()) {
            this.a(0.0);
         } else if ($$1 > (double)(this.r() + this.p)) {
            this.a((double)this.d());
         } else {
            int $$5 = this.v();
            double $$6 = (double)Math.max(1, this.d() / (this.p - $$5));
            this.a(this.e + $$4 * $$6);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      if (!this.s) {
         return false;
      } else {
         this.a(this.e - $$2 * this.g());
         return true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      boolean $$3 = $$0 == 265;
      boolean $$4 = $$0 == 264;
      if ($$3 || $$4) {
         double $$5 = this.e;
         this.a(this.e + (double)($$3 ? -1 : 1) * this.g());
         if ($$5 != this.e) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      if (this.s) {
         this.b($$0);
         $$0.c(this.p() + 1, this.r() + 1, this.p() + this.o - 1, this.r() + this.p - 1);
         $$0.c().a();
         $$0.c().a(0.0, -this.e, 0.0);
         this.c($$0, $$1, $$2, $$3);
         $$0.c().b();
         $$0.f();
         this.a($$0);
      }
   }

   private int v() {
      return apa.a((int)((float)(this.p * this.p) / (float)this.w()), 32, this.p);
   }

   protected void a(eox $$0) {
      if (this.e()) {
         this.c($$0);
      }
   }

   protected int a() {
      return 4;
   }

   protected int b() {
      return this.a() * 2;
   }

   protected double c() {
      return this.e;
   }

   protected void a(double $$0) {
      this.e = apa.a($$0, 0.0, (double)this.d());
   }

   protected int d() {
      return Math.max(0, this.w() - (this.p - 4));
   }

   private int w() {
      return this.f() + 4;
   }

   protected void b(eox $$0) {
      this.a($$0, this.p(), this.r(), this.k(), this.h());
   }

   protected void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = this.aB_() ? -1 : -6250336;
      $$0.a($$1, $$2, $$1 + $$3, $$2 + $$4, $$5);
      $$0.a($$1 + 1, $$2 + 1, $$1 + $$3 - 1, $$2 + $$4 - 1, -16777216);
   }

   private void c(eox $$0) {
      int $$1 = this.v();
      int $$2 = this.p() + this.o;
      int $$3 = this.p() + this.o + 8;
      int $$4 = Math.max(this.r(), (int)this.e * (this.p - $$1) / this.d() + this.r());
      int $$5 = $$4 + $$1;
      $$0.a($$2, $$4, $$3, $$5, -8355712);
      $$0.a($$2, $$4, $$3 - 1, $$5 - 1, -4144960);
   }

   protected boolean a(int $$0, int $$1) {
      return (double)$$1 - this.e >= (double)this.r() && (double)$$0 - this.e <= (double)(this.r() + this.p);
   }

   protected boolean c(double $$0, double $$1) {
      return $$0 >= (double)this.p() && $$0 < (double)(this.p() + this.o) && $$1 >= (double)this.r() && $$1 < (double)(this.r() + this.p);
   }

   protected boolean e() {
      return this.f() > this.h();
   }

   protected abstract int f();

   protected abstract double g();

   protected abstract void c(eox var1, int var2, int var3, float var4);
}
