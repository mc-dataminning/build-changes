public class fli extends fkv<cnn> implements fnq {
   private static final ajv A = new ajv("textures/gui/container/crafting_table.png");
   private final fnk B = new fnk();
   private boolean C;

   public fli(cnn $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.C = this.k < 379;
      this.B.a(this.k, this.l, this.j, this.C, this.s);
      this.w = this.B.a(this.k, this.c);
      this.c(new fek(this.w + 5, this.l / 2 - 49, 20, 18, fnk.a, $$0 -> {
         this.B.e();
         this.w = this.B.a(this.k, this.c);
         $$0.c(this.w + 5, this.l / 2 - 49);
      }));
      this.d(this.B);
      this.o = 29;
   }

   @Override
   public void C() {
      super.C();
      this.B.h();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      if (this.B.f() && this.C) {
         this.b($$0, $$1, $$2, $$3);
         this.B.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.B.a($$0, $$1, $$2, $$3);
         this.B.a($$0, this.w, this.x, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.B.a($$0, this.w, this.x, $$1, $$2);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.w;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.d);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.B.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.B.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.C || !this.B.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.B.a($$0, $$1, $$2)) {
         this.a(this.B);
         return true;
      } else {
         return this.C && this.B.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      return this.B.a($$0, $$1, this.w, this.x, this.c, this.d, $$4) && $$5;
   }

   @Override
   protected void a(cos $$0, int $$1, int $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.B.a($$0);
   }

   @Override
   public void E() {
      this.B.i();
   }

   @Override
   public fnk F() {
      return this.B;
   }
}
