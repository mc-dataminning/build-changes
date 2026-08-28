public class fmn extends flx {
   private final flo a;
   private final fmx b;

   public fmn(int $$0, int $$1, int $$2, int $$3, xj $$4, flo $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new fmx($$4, $$5).d(this.y() - this.b());
   }

   public fmn a(int $$0) {
      this.b.c($$0);
      return this;
   }

   @Override
   public void k(int $$0) {
      super.k($$0);
      this.b.d(this.y() - this.b());
   }

   @Override
   protected int h() {
      return this.b.w();
   }

   @Override
   protected double i() {
      return 9.0;
   }

   @Override
   protected void b(flq $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aL_()) {
         this.a($$0, this.D() - this.a(), this.E() - this.a(), this.y() + this.b(), this.w() + this.b());
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (!this.e()) {
            this.b($$0);
            $$0.c().a();
            $$0.c().a((float)this.D(), (float)this.E(), 0.0F);
            this.b.a($$0, $$1, $$2, $$3);
            $$0.c().b();
         } else {
            super.b($$0, $$1, $$2, $$3);
         }
      }
   }

   public boolean j() {
      return super.e();
   }

   @Override
   protected void c(flq $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.D() + this.a()), (float)(this.E() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(fqb $$0) {
      $$0.a(fqa.a, this.z());
   }
}
