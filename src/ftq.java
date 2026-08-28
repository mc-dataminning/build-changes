public class ftq extends fsf {
   private float a = 0.5F;

   public ftq(wy $$0, frt $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public ftq(int $$0, int $$1, wy $$2, frt $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public ftq(int $$0, int $$1, int $$2, int $$3, wy $$4, frt $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public ftq b(int $$0) {
      super.a($$0);
      return this;
   }

   private ftq b(float $$0) {
      this.a = $$0;
      return this;
   }

   public ftq c() {
      return this.b(0.0F);
   }

   public ftq e() {
      return this.b(0.5F);
   }

   public ftq g() {
      return this.b(1.0F);
   }

   @Override
   public void b(frv $$0, int $$1, int $$2, float $$3) {
      wy $$4 = this.B();
      frt $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayy a(wy $$0, int $$1) {
      frt $$2 = this.a();
      xd $$3 = $$2.a($$0, $$1 - $$2.a(wx.u));
      return tu.a().a(xd.a($$3, wx.u));
   }
}
