public abstract class euy extends evc implements ewh, ewz {
   private static final ewr a = new ewr(new agm("widget/text_field"), new agm("widget/text_field_highlighted"));
   private static final agm b = new agm("widget/scroller");
   private static final int c = 4;
   private static final int d = 8;
   private double e;
   private boolean l;

   public euy(int $$0, int $$1, int $$2, int $$3, uv $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (!this.j) {
         return false;
      } else {
         boolean $$3 = this.b($$0, $$1);
         boolean $$4 = this.e()
            && $$0 >= (double)(this.p() + this.f)
            && $$0 <= (double)(this.p() + this.f + 8)
            && $$1 >= (double)this.r()
            && $$1 < (double)(this.r() + this.g);
         if ($$4 && $$2 == 0) {
            this.l = true;
            return true;
         } else {
            return $$3 || $$4;
         }
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         this.l = false;
      }

      return super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.j && this.aK_() && this.l) {
         if ($$1 < (double)this.r()) {
            this.a(0.0);
         } else if ($$1 > (double)(this.r() + this.g)) {
            this.a((double)this.d());
         } else {
            int $$5 = this.v();
            double $$6 = (double)Math.max(1, this.d() / (this.g - $$5));
            this.a(this.e + $$4 * $$6);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.j) {
         return false;
      } else {
         this.a(this.e - $$3 * this.h());
         return true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      boolean $$3 = $$0 == 265;
      boolean $$4 = $$0 == 264;
      if ($$3 || $$4) {
         double $$5 = this.e;
         this.a(this.e + (double)($$3 ? -1 : 1) * this.h());
         if ($$5 != this.e) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      if (this.j) {
         this.b($$0);
         $$0.c(this.p() + 1, this.r() + 1, this.p() + this.f - 1, this.r() + this.g - 1);
         $$0.c().a();
         $$0.c().a(0.0, -this.e, 0.0);
         this.c($$0, $$1, $$2, $$3);
         $$0.c().b();
         $$0.f();
         this.a($$0);
      }
   }

   private int v() {
      return atq.a((int)((float)(this.g * this.g) / (float)this.w()), 32, this.g);
   }

   protected void a(eut $$0) {
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
      this.e = atq.a($$0, 0.0, (double)this.d());
   }

   protected int d() {
      return Math.max(0, this.w() - (this.g - 4));
   }

   private int w() {
      return this.g() + 4;
   }

   protected void b(eut $$0) {
      this.a($$0, this.p(), this.r(), this.k(), this.i());
   }

   protected void a(eut $$0, int $$1, int $$2, int $$3, int $$4) {
      agm $$5 = a.a(this.aM_(), this.aK_());
      $$0.a($$5, $$1, $$2, $$3, $$4);
   }

   private void c(eut $$0) {
      int $$1 = this.v();
      int $$2 = this.p() + this.f;
      int $$3 = Math.max(this.r(), (int)this.e * (this.g - $$1) / this.d() + this.r());
      $$0.a(b, $$2, $$3, 8, $$1);
   }

   protected boolean a(int $$0, int $$1) {
      return (double)$$1 - this.e >= (double)this.r() && (double)$$0 - this.e <= (double)(this.r() + this.g);
   }

   protected boolean b(double $$0, double $$1) {
      return $$0 >= (double)this.p() && $$0 < (double)(this.p() + this.f) && $$1 >= (double)this.r() && $$1 < (double)(this.r() + this.g);
   }

   protected boolean e() {
      return this.g() > this.i();
   }

   public int f() {
      return 8;
   }

   protected abstract int g();

   protected abstract double h();

   protected abstract void c(eut var1, int var2, int var3, float var4);
}
