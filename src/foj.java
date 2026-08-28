public class foj extends fnw<cqg> implements fqr {
   private static final alb D = new alb("textures/gui/container/crafting_table.png");
   private final fql E = new fql();
   private boolean F;

   public foj(cqg $$0, cmr $$1, xl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.F = this.n < 379;
      this.E.a(this.n, this.o, this.m, this.F, this.w);
      this.z = this.E.a(this.n, this.c);
      this.c(new fhl(this.z + 5, this.o / 2 - 49, 20, 18, fql.a, $$0 -> {
         this.E.e();
         this.z = this.E.a(this.n, this.c);
         $$0.c(this.z + 5, this.o / 2 - 49);
      }));
      this.d(this.E);
      this.r = 29;
   }

   @Override
   public void C() {
      super.C();
      this.E.h();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      if (this.E.f() && this.F) {
         this.b($$0, $$1, $$2, $$3);
         this.E.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.E.a($$0, $$1, $$2, $$3);
         this.E.a($$0, this.z, this.A, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.E.a($$0, this.z, this.A, $$1, $$2);
   }

   @Override
   protected void a(fgm $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.E.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.E.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.F || !this.E.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.E.a($$0, $$1, $$2)) {
         this.a(this.E);
         return true;
      } else {
         return this.F && this.E.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      return this.E.a($$0, $$1, this.z, this.A, this.c, this.d, $$4) && $$5;
   }

   @Override
   protected void a(crk $$0, int $$1, int $$2, cpy $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0);
   }

   @Override
   public void E() {
      this.E.i();
   }

   @Override
   public fql F() {
      return this.E;
   }
}
