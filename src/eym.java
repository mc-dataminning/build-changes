public class eym extends exc {
   private float a = 0.5F;

   public eym(vf $$0, ewr $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public eym(int $$0, int $$1, vf $$2, ewr $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public eym(int $$0, int $$1, int $$2, int $$3, vf $$4, ewr $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public eym b(int $$0) {
      super.a($$0);
      return this;
   }

   private eym b(float $$0) {
      this.a = $$0;
      return this;
   }

   public eym d() {
      return this.b(0.0F);
   }

   public eym e() {
      return this.b(0.5F);
   }

   public eym f() {
      return this.b(1.0F);
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      vf $$4 = this.x();
      ewr $$5 = this.a();
      int $$6 = this.w();
      int $$7 = $$5.a($$4);
      int $$8 = this.B() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.C() + (this.u() - 9) / 2;
      atz $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private atz a(vf $$0, int $$1) {
      ewr $$2 = this.a();
      vk $$3 = $$2.a($$0, $$1 - $$2.a(ve.t));
      return si.a().a(vk.a($$3, ve.t));
   }
}
