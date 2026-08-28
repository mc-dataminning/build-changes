public class fpe extends foq<cqm> implements fse {
   private static final akr E = akr.b("textures/gui/container/crafting_table.png");
   private final fry F = new fry();
   private boolean G;

   public fpe(cqm $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.G = this.m < 379;
      this.F.a(this.m, this.n, this.l, this.G, this.x);
      this.A = this.F.a(this.m, this.c);
      this.c(new fiw(this.A + 5, this.n / 2 - 49, 20, 18, fry.a, $$0 -> {
         this.F.e();
         this.A = this.F.a(this.m, this.c);
         $$0.c(this.A + 5, this.n / 2 - 49);
      }));
      this.d(this.F);
      this.s = 29;
   }

   @Override
   public void C() {
      super.C();
      this.F.h();
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      if (this.F.f() && this.G) {
         this.b($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.F.a($$0, this.A, this.B, true, $$3);
      }

      this.a($$0, $$1, $$2);
      this.F.a($$0, this.A, this.B, $$1, $$2);
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.r);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.F.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.F.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.G || !this.F.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.F.a($$0, $$1, $$2)) {
         this.a(this.F);
         return true;
      } else {
         return this.G && this.F.f() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.r);
      return this.F.a($$0, $$1, this.A, this.B, this.c, this.r, $$4) && $$5;
   }

   @Override
   protected void a(crq $$0, int $$1, int $$2, cqe $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F.a($$0);
   }

   @Override
   public void E() {
      this.F.i();
   }

   @Override
   public fry F() {
      return this.F;
   }
}
