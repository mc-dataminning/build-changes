public abstract class foc<T extends cpv> extends fob<T> implements fqw {
   public final fqm D;
   private boolean E;
   private final alf F;
   private final alf G;
   private final alf H;

   public foc(T $$0, fqm $$1, cmw $$2, xp $$3, alf $$4, alf $$5, alf $$6) {
      super($$0, $$2, $$3);
      this.D = $$1;
      this.F = $$4;
      this.G = $$5;
      this.H = $$6;
   }

   @Override
   public void aM_() {
      super.aM_();
      this.E = this.n < 379;
      this.D.a(this.n, this.o, this.m, this.E, this.w);
      this.z = this.D.a(this.n, this.c);
      this.c(new fhq(this.z + 20, this.o / 2 - 49, 20, 18, fqq.a, $$0 -> {
         this.D.e();
         this.z = this.D.a(this.n, this.c);
         $$0.c(this.z + 20, this.o / 2 - 49);
      }));
      this.r = (this.c - this.p.a(this.l)) / 2;
   }

   @Override
   public void E() {
      super.E();
      this.D.h();
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
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
   protected void a(fgr $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(this.F, $$4, $$5, 0, 0, this.c, this.d);
      if (this.w.s()) {
         int $$6 = 14;
         int $$7 = ayz.f(this.w.r() * 13.0F) + 1;
         $$0.a(this.G, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = ayz.f(this.w.q() * 24.0F);
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
   protected void a(crp $$0, int $$1, int $$2, cqd $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.D.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.D.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      return this.D.a($$0, $$1, this.z, this.A, this.c, this.d, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.D.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void I() {
      this.D.i();
   }

   @Override
   public fqq J() {
      return this.D;
   }
}
