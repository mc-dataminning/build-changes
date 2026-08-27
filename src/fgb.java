public class fgb extends fer {
   private float a = 0.5F;

   public fgb(ws $$0, fef $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fgb(int $$0, int $$1, ws $$2, fef $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fgb(int $$0, int $$1, int $$2, int $$3, ws $$4, fef $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fgb b(int $$0) {
      super.a($$0);
      return this;
   }

   private fgb b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fgb d() {
      return this.b(0.0F);
   }

   public fgb e() {
      return this.b(0.5F);
   }

   public fgb f() {
      return this.b(1.0F);
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      ws $$4 = this.y();
      fef $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      axi $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axi a(ws $$0, int $$1) {
      fef $$2 = this.a();
      wx $$3 = $$2.a($$0, $$1 - $$2.a(wr.u));
      return tt.a().a(wx.a($$3, wr.u));
   }
}
