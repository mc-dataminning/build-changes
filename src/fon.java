public class fon extends fnx {
   private final fno a;
   private final foy b;

   public fon(int $$0, int $$1, int $$2, int $$3, xv $$4, fno $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new foy($$4, $$5).d(this.y() - this.b());
   }

   public fon a(int $$0) {
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
   protected void b(fnq $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aN_()) {
         this.a($$0, this.D() - this.a(), this.E() - this.a(), this.y() + this.b(), this.w() + this.b());
      }
   }

   @Override
   public void b(fnq $$0, int $$1, int $$2, float $$3) {
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
   protected void c(fnq $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.D() + this.a()), (float)(this.E() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(fsb $$0) {
      $$0.a(fsa.a, this.z());
   }
}
