public abstract class fnz<T extends cpi> extends fny<T> implements frk {
   public final fra D;
   private boolean E;
   private final akk F;
   private final akk G;
   private final akk H;

   public fnz(T $$0, fra $$1, cmj $$2, wu $$3, akk $$4, akk $$5, akk $$6) {
      super($$0, $$2, $$3);
      this.D = $$1;
      this.F = $$4;
      this.G = $$5;
      this.H = $$6;
   }

   @Override
   public void aP_() {
      super.aP_();
      this.E = this.m < 379;
      this.D.a(this.m, this.n, this.l, this.E, this.w);
      this.z = this.D.a(this.m, this.c);
      this.c(new fie(this.z + 20, this.n / 2 - 49, 20, 18, fre.a, $$0 -> {
         this.D.e();
         this.z = this.D.a(this.m, this.c);
         $$0.c(this.z + 20, this.n / 2 - 49);
      }));
      this.r = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   public void E() {
      super.E();
      this.D.h();
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      if (this.D.f() && this.E) {
         this.b($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
         this.D.a($$0, this.z, this.A, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.D.a($$0, this.z, this.A, $$1, $$2);
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(this.F, $$4, $$5, 0, 0, this.c, this.q);
      if (this.w.s()) {
         int $$6 = 14;
         int $$7 = ayg.f(this.w.r() * 13.0F) + 1;
         $$0.a(this.G, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = ayg.f(this.w.q() * 24.0F);
      $$0.a(this.H, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.D.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.E && this.D.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(crd $$0, int $$1, int $$2, cpr $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.D.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.q);
      return this.D.a($$0, $$1, this.z, this.A, this.c, this.q, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.D.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void G() {
      this.D.i();
   }

   @Override
   public fre J() {
      return this.D;
   }
}
