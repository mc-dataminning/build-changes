public class fon extends foa<cqa> implements frm {
   private static final akk D = new akk("textures/gui/container/crafting_table.png");
   private final frg E = new frg();
   private boolean F;

   public fon(cqa $$0, cmk $$1, wu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.F = this.m < 379;
      this.E.a(this.m, this.n, this.l, this.F, this.w);
      this.z = this.E.a(this.m, this.c);
      this.c(new fig(this.z + 5, this.n / 2 - 49, 20, 18, frg.a, $$0 -> {
         this.E.e();
         this.z = this.E.a(this.m, this.c);
         $$0.c(this.z + 5, this.n / 2 - 49);
      }));
      this.d(this.E);
      this.r = 29;
   }

   @Override
   public void D() {
      super.D();
      this.E.h();
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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
   protected void a(fhh $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.q);
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
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.q);
      return this.E.a($$0, $$1, this.z, this.A, this.c, this.q, $$4) && $$5;
   }

   @Override
   protected void a(cre $$0, int $$1, int $$2, cps $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.a($$0);
   }

   @Override
   public void F() {
      this.E.i();
   }

   @Override
   public frg G() {
      return this.E;
   }
}
