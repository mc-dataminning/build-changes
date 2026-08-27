public abstract class fba extends fbe implements fcj, fdc {
   private static final fct a = new fct(new ajh("widget/text_field"), new ajh("widget/text_field_highlighted"));
   private static final ajh b = new ajh("widget/scroller");
   private static final int c = 4;
   private static final int d = 8;
   private double e;
   private boolean f;

   public fba(int $$0, int $$1, int $$2, int $$3, vu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (!this.k) {
         return false;
      } else {
         boolean $$3 = this.b($$0, $$1);
         boolean $$4 = this.e()
            && $$0 >= (double)(this.B() + this.g)
            && $$0 <= (double)(this.B() + this.g + 8)
            && $$1 >= (double)this.C()
            && $$1 < (double)(this.C() + this.h);
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
      if (this.k && this.aJ_() && this.f) {
         if ($$1 < (double)this.C()) {
            this.a(0.0);
         } else if ($$1 > (double)(this.C() + this.h)) {
            this.a((double)this.d());
         } else {
            int $$5 = this.j();
            double $$6 = (double)Math.max(1, this.d() / (this.h - $$5));
            this.a(this.e + $$4 * $$6);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.k) {
         return false;
      } else {
         this.a(this.e - $$3 * this.i());
         return true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      boolean $$3 = $$0 == 265;
      boolean $$4 = $$0 == 264;
      if ($$3 || $$4) {
         double $$5 = this.e;
         this.a(this.e + (double)($$3 ? -1 : 1) * this.i());
         if ($$5 != this.e) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.b($$0);
         $$0.c(this.B() + 1, this.C() + 1, this.B() + this.g - 1, this.C() + this.h - 1);
         $$0.c().a();
         $$0.c().a(0.0, -this.e, 0.0);
         this.c($$0, $$1, $$2, $$3);
         $$0.c().b();
         $$0.f();
         this.a($$0);
      }
   }

   private int j() {
      return aww.a((int)((float)(this.h * this.h) / (float)this.k()), 32, this.h);
   }

   protected void a(fat $$0) {
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
      this.e = aww.a($$0, 0.0, (double)this.d());
   }

   protected int d() {
      return Math.max(0, this.k() - (this.h - 4));
   }

   private int k() {
      return this.g() + 4;
   }

   protected void b(fat $$0) {
      this.a($$0, this.B(), this.C(), this.w(), this.u());
   }

   protected void a(fat $$0, int $$1, int $$2, int $$3, int $$4) {
      ajh $$5 = a.a(this.A(), this.aJ_());
      $$0.a($$5, $$1, $$2, $$3, $$4);
   }

   private void c(fat $$0) {
      int $$1 = this.j();
      int $$2 = this.B() + this.g;
      int $$3 = Math.max(this.C(), (int)this.e * (this.h - $$1) / this.d() + this.C());
      $$0.a(b, $$2, $$3, 8, $$1);
   }

   protected boolean a(int $$0, int $$1) {
      return (double)$$1 - this.e >= (double)this.C() && (double)$$0 - this.e <= (double)(this.C() + this.h);
   }

   protected boolean b(double $$0, double $$1) {
      return $$0 >= (double)this.B() && $$0 < (double)(this.B() + this.g) && $$1 >= (double)this.C() && $$1 < (double)(this.C() + this.h);
   }

   protected boolean e() {
      return this.g() > this.u();
   }

   public int f() {
      return 8;
   }

   protected abstract int g();

   protected abstract double i();

   protected abstract void c(fat var1, int var2, int var3, float var4);
}
