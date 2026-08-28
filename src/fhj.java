public class fhj extends fgt {
   private final fgk a;
   private final fht b;

   public fhj(int $$0, int $$1, int $$2, int $$3, xl $$4, fgk $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new fht($$4, $$5).d(this.x() - this.b());
   }

   public fhj a(int $$0) {
      this.b.c($$0);
      return this;
   }

   @Override
   public void k(int $$0) {
      super.k($$0);
      this.b.d(this.x() - this.b());
   }

   @Override
   protected int h() {
      return this.b.v();
   }

   @Override
   protected double i() {
      return 9.0;
   }

   @Override
   protected void b(fgm $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aJ_()) {
         this.a($$0, this.C() - this.a(), this.D() - this.a(), this.x() + this.b(), this.v() + this.b());
      }
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (!this.e()) {
            this.b($$0);
            $$0.c().a();
            $$0.c().a((float)this.C(), (float)this.D(), 0.0F);
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
   protected void c(fgm $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.C() + this.a()), (float)(this.D() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(fkv $$0) {
      $$0.a(fku.a, this.y());
   }
}
