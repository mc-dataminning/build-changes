public class fjn extends fid {
   private float a = 0.5F;

   public fjn(wy $$0, fhr $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fjn(int $$0, int $$1, wy $$2, fhr $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fjn(int $$0, int $$1, int $$2, int $$3, wy $$4, fhr $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fjn b(int $$0) {
      super.a($$0);
      return this;
   }

   private fjn b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fjn c() {
      return this.b(0.0F);
   }

   public fjn e() {
      return this.b(0.5F);
   }

   public fjn f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      wy $$4 = this.z();
      fhr $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      axz $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axz a(wy $$0, int $$1) {
      fhr $$2 = this.a();
      xd $$3 = $$2.a($$0, $$1 - $$2.a(wx.u));
      return tv.a().a(xd.a($$3, wx.u));
   }
}
