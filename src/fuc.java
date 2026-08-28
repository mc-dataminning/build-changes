public class fuc extends fsr {
   private float a = 0.5F;

   public fuc(wy $$0, fsf $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fuc(int $$0, int $$1, wy $$2, fsf $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fuc(int $$0, int $$1, int $$2, int $$3, wy $$4, fsf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fuc b(int $$0) {
      super.a($$0);
      return this;
   }

   private fuc b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fuc c() {
      return this.b(0.0F);
   }

   public fuc e() {
      return this.b(0.5F);
   }

   public fuc g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      wy $$4 = this.B();
      fsf $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayy a(wy $$0, int $$1) {
      fsf $$2 = this.a();
      xd $$3 = $$2.a($$0, $$1 - $$2.a(wx.u));
      return tu.a().a(xd.a($$3, wx.u));
   }
}
