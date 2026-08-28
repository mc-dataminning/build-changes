public abstract class fsc extends fsh {
   public static final int b = 6;
   private double a;
   private static final alg c = alg.b("widget/scroller");
   private static final alg d = alg.b("widget/scroller_background");
   private boolean e;

   public fsc(int $$0, int $$1, int $$2, int $$3, wy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.k) {
         return false;
      } else {
         this.a(this.g() - $$3 * this.o());
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.e) {
         if ($$1 < (double)this.G()) {
            this.a(0.0);
         } else if ($$1 > (double)this.I()) {
            this.a((double)this.i());
         } else {
            double $$5 = (double)Math.max(1, this.i());
            int $$6 = this.k();
            double $$7 = Math.max(1.0, $$5 / (double)(this.h - $$6));
            this.a(this.g() + $$4 * $$7);
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(double $$0, double $$1) {
      this.e = false;
   }

   public double g() {
      return this.a;
   }

   public void a(double $$0) {
      this.a = azm.a($$0, 0.0, (double)this.i());
   }

   public boolean c(double $$0, double $$1, int $$2) {
      this.e = this.j() && this.g($$2) && $$0 >= (double)this.l() && $$0 <= (double)(this.l() + 6) && $$1 >= (double)this.G() && $$1 < (double)this.I();
      return this.e;
   }

   public void h() {
      this.a(this.a);
   }

   public int i() {
      return Math.max(0, this.n() - this.h);
   }

   protected boolean j() {
      return this.i() > 0;
   }

   protected int k() {
      return azm.a((int)((float)(this.h * this.h) / (float)this.n()), 32, this.h - 8);
   }

   protected int l() {
      return this.H() - 6;
   }

   protected int m() {
      return Math.max(this.G(), (int)this.a * (this.h - this.k()) / this.i() + this.G());
   }

   protected void a(frv $$0) {
      if (this.j()) {
         int $$1 = this.l();
         int $$2 = this.k();
         int $$3 = this.m();
         $$0.a(gqk::H, d, $$1, this.G(), 6, this.y());
         $$0.a(gqk::H, c, $$1, $$3, 6, $$2);
      }
   }

   protected abstract int n();

   protected abstract double o();
}
