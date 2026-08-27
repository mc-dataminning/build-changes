public abstract class fkw<T extends cmx> extends fkv<T> implements fnq {
   public final fng A;
   private boolean B;
   private final ajv C;
   private final ajv D;
   private final ajv E;

   public fkw(T $$0, fng $$1, cjz $$2, wi $$3, ajv $$4, ajv $$5, ajv $$6) {
      super($$0, $$2, $$3);
      this.A = $$1;
      this.C = $$4;
      this.D = $$5;
      this.E = $$6;
   }

   @Override
   public void aM_() {
      super.aM_();
      this.B = this.k < 379;
      this.A.a(this.k, this.l, this.j, this.B, this.s);
      this.w = this.A.a(this.k, this.c);
      this.c(new fek(this.w + 20, this.l / 2 - 49, 20, 18, fnk.a, $$0 -> {
         this.A.e();
         this.w = this.A.a(this.k, this.c);
         $$0.c(this.w + 20, this.l / 2 - 49);
      }));
      this.o = (this.c - this.m.a(this.i)) / 2;
   }

   @Override
   public void C() {
      super.C();
      this.A.h();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      if (this.A.f() && this.B) {
         this.b($$0, $$1, $$2, $$3);
         this.A.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.w, this.x, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.A.a($$0, this.w, this.x, $$1, $$2);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.w;
      int $$5 = this.x;
      $$0.a(this.C, $$4, $$5, 0, 0, this.c, this.d);
      if (this.s.s()) {
         int $$6 = 14;
         int $$7 = axm.f(this.s.r() * 13.0F) + 1;
         $$0.a(this.D, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = axm.f(this.s.q() * 24.0F);
      $$0.a(this.E, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.A.a($$0, $$1, $$2)) {
         return true;
      } else {
         return this.B && this.A.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(cos $$0, int $$1, int $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.A.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.A.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      return this.A.a($$0, $$1, this.w, this.x, this.c, this.d, $$4) && $$5;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.A.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public void E() {
      this.A.i();
   }

   @Override
   public fnk F() {
      return this.A;
   }
}
