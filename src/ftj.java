public class ftj extends fry {
   private float a = 0.5F;

   public ftj(wy $$0, frm $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public ftj(int $$0, int $$1, wy $$2, frm $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public ftj(int $$0, int $$1, int $$2, int $$3, wy $$4, frm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public ftj b(int $$0) {
      super.a($$0);
      return this;
   }

   private ftj b(float $$0) {
      this.a = $$0;
      return this;
   }

   public ftj c() {
      return this.b(0.0F);
   }

   public ftj e() {
      return this.b(0.5F);
   }

   public ftj g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      wy $$4 = this.B();
      frm $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayy a(wy $$0, int $$1) {
      frm $$2 = this.a();
      xd $$3 = $$2.a($$0, $$1 - $$2.a(wx.u));
      return tu.a().a(xd.a($$3, wx.u));
   }
}
