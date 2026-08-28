public class fsx extends frm {
   private float a = 0.5F;

   public fsx(ww $$0, fra $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fsx(int $$0, int $$1, ww $$2, fra $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fsx(int $$0, int $$1, int $$2, int $$3, ww $$4, fra $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fsx b(int $$0) {
      super.a($$0);
      return this;
   }

   private fsx b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fsx c() {
      return this.b(0.0F);
   }

   public fsx e() {
      return this.b(0.5F);
   }

   public fsx g() {
      return this.b(1.0F);
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      ww $$4 = this.B();
      fra $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayw $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayw a(ww $$0, int $$1) {
      fra $$2 = this.a();
      xb $$3 = $$2.a($$0, $$1 - $$2.a(wv.u));
      return ts.a().a(xb.a($$3, wv.u));
   }
}
