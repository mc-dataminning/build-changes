public abstract class fqx<T extends crb> extends fqw<T> implements fuj {
   private final fud<?> G;
   private boolean H;
   private final ale I;
   private final ale J;
   private final ale K;

   public fqx(T $$0, cnw $$1, xe $$2, xe $$3, ale $$4, ale $$5, ale $$6) {
      super($$0, $$1, $$2);
      this.G = new fua($$0, $$3);
      this.I = $$4;
      this.J = $$5;
      this.K = $$6;
   }

   @Override
   public void aS_() {
      super.aS_();
      this.H = this.n < 379;
      this.G.a(this.n, this.o, this.m, this.H);
      this.C = this.G.a(this.n, this.s);
      this.c(new fla(this.C + 20, this.o / 2 - 49, 20, 18, fud.a, $$0 -> {
         this.G.c();
         this.C = this.G.a(this.n, this.s);
         $$0.c(this.C + 20, this.o / 2 - 49);
      }));
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   public void D() {
      super.D();
      this.G.e();
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      if (this.G.d() && this.H) {
         this.b($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         this.G.a($$0, this.C, this.D, true);
      }

      this.a($$0, $$1, $$2);
      this.G.a($$0, $$1, $$2, this.B);
   }

   @Override
   protected void a(fkb $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(ghv::B, this.I, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azf.f(this.z.n() * 13.0F) + 1;
         $$0.a(ghv::B, this.J, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azf.f(this.z.m() * 24.0F);
      $$0.a(ghv::B, this.K, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.G.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.H && this.G.d() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(csw $$0, int $$1, int $$2, crk $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G.b($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.G.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      return this.G.a($$0, $$1, this.C, this.D, this.s, this.u, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.G.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void F() {
      this.G.f();
   }

   @Override
   public fud G() {
      return this.G;
   }
}
