public class exi extends ews {
   private final ewk a;
   private final exs b;

   public exi(int $$0, int $$1, int $$2, int $$3, vd $$4, ewk $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new exs($$4, $$5).c(this.w() - this.b());
   }

   public exi a(int $$0) {
      this.b.b($$0);
      return this;
   }

   @Override
   public void l(int $$0) {
      super.l($$0);
      this.b.c(this.w() - this.b());
   }

   @Override
   protected int g() {
      return this.b.u();
   }

   @Override
   protected double i() {
      return 9.0;
   }

   @Override
   protected void b(ewm $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aI_()) {
         this.a($$0, this.B() - this.a(), this.C() - this.a(), this.w() + this.b(), this.u() + this.b());
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (!this.e()) {
            this.b($$0);
            $$0.c().a();
            $$0.c().a((float)this.B(), (float)this.C(), 0.0F);
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
   protected void c(ewm $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.B() + this.a()), (float)(this.C() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(far $$0) {
      $$0.a(faq.a, this.x());
   }
}
