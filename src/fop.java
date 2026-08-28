public abstract class fop extends fol {
   private static final fqg a = new fqg(akv.b("widget/text_field"), akv.b("widget/text_field_highlighted"));
   private static final int c = 4;

   public fop(int $$0, int $$1, int $$2, int $$3, wp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      boolean $$3 = $$0 == 265;
      boolean $$4 = $$0 == 264;
      if ($$3 || $$4) {
         double $$5 = this.g();
         this.a(this.g() + (double)($$3 ? -1 : 1) * this.o());
         if ($$5 != this.g()) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         this.c($$0);
         $$0.c(this.F() + 1, this.G() + 1, this.F() + this.g - 1, this.G() + this.h - 1);
         $$0.c().a();
         $$0.c().a(0.0, -this.g(), 0.0);
         this.c($$0, $$1, $$2, $$3);
         $$0.c().b();
         $$0.e();
         this.b($$0);
      }
   }

   protected void b(foe $$0) {
      this.a($$0);
   }

   protected int a() {
      return 4;
   }

   protected int b() {
      return this.a() * 2;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.j && this.k && $$0 >= (double)this.F() && $$1 >= (double)this.G() && $$0 < (double)(this.H() + 6) && $$1 < (double)this.I();
   }

   @Override
   protected int l() {
      return this.H();
   }

   @Override
   protected int n() {
      return this.c() + this.b();
   }

   protected void c(foe $$0) {
      this.a($$0, this.F(), this.G(), this.A(), this.y());
   }

   protected void a(foe $$0, int $$1, int $$2, int $$3, int $$4) {
      akv $$5 = a.a(this.E(), this.aM_());
      $$0.a(gmi::H, $$5, $$1, $$2, $$3, $$4);
   }

   protected boolean a(int $$0, int $$1) {
      return (double)$$1 - this.g() >= (double)this.G() && (double)$$0 - this.g() <= (double)(this.G() + this.h);
   }

   protected abstract int c();

   protected abstract void c(foe var1, int var2, int var3, float var4);

   protected int e() {
      return this.F() + this.a();
   }

   protected int p() {
      return this.G() + this.a();
   }

   @Override
   public void a(hjv $$0) {
   }
}
