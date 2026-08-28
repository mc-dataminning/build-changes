public abstract class fou<T extends cpv> extends fot<T> implements fsg {
   public final frw E;
   private boolean F;
   private final akr G;
   private final akr H;
   private final akr I;

   public fou(T $$0, frw $$1, cmw $$2, wz $$3, akr $$4, akr $$5, akr $$6) {
      super($$0, $$2, $$3);
      this.E = $$1;
      this.G = $$4;
      this.H = $$5;
      this.I = $$6;
   }

   @Override
   public void aT_() {
      super.aT_();
      this.F = this.m < 379;
      this.E.a(this.m, this.n, this.l, this.F, this.x);
      this.A = this.E.a(this.m, this.c);
      this.c(new fiy(this.A + 20, this.n / 2 - 49, 20, 18, fsa.a, $$0 -> {
         this.E.e();
         this.A = this.E.a(this.m, this.c);
         $$0.c(this.A + 20, this.n / 2 - 49);
      }));
      this.s = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   public void C() {
      super.C();
      this.E.h();
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.E.f() && this.F) {
         this.b($$0, $$1, $$2, $$3);
         this.E.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.E.a($$0, $$1, $$2, $$3);
         this.E.a($$0, this.A, this.B, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.E.a($$0, this.A, this.B, $$1, $$2);
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(this.G, $$4, $$5, 0, 0, this.c, this.r);
      if (this.x.s()) {
         int $$6 = 14;
         int $$7 = ayo.f(this.x.r() * 13.0F) + 1;
         $$0.a(this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = ayo.f(this.x.q() * 24.0F);
      $$0.a(this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.E.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.F && this.E.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(crq $$0, int $$1, int $$2, cqe $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.E.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.r);
      return this.E.a($$0, $$1, this.A, this.B, this.c, this.r, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.E.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void E() {
      this.E.i();
   }

   @Override
   public fsa F() {
      return this.E;
   }
}
