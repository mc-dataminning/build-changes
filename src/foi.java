public class foi extends fns {
   private final fnj a;
   private final fot b;

   public foi(int $$0, int $$1, int $$2, int $$3, xk $$4, fnj $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new fot($$4, $$5).d(this.y() - this.b());
   }

   public foi a(int $$0) {
      this.b.c($$0);
      return this;
   }

   @Override
   public void i(int $$0) {
      super.i($$0);
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
   protected void b(fnl $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aN_()) {
         this.a($$0, this.D() - this.a(), this.E() - this.a(), this.y() + this.b(), this.w() + this.b());
      }
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
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
   protected void c(fnl $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.D() + this.a()), (float)(this.E() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(frw $$0) {
      $$0.a(frv.a, this.z());
   }
}
