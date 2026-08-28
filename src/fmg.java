public class fmg extends fkw {
   private float a = 0.5F;

   public fmg(xh $$0, fkk $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fmg(int $$0, int $$1, xh $$2, fkk $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fmg(int $$0, int $$1, int $$2, int $$3, xh $$4, fkk $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fmg b(int $$0) {
      super.a($$0);
      return this;
   }

   private fmg b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fmg c() {
      return this.b(0.0F);
   }

   public fmg e() {
      return this.b(0.5F);
   }

   public fmg f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      xh $$4 = this.z();
      fkk $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      ayv $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayv a(xh $$0, int $$1) {
      fkk $$2 = this.a();
      xm $$3 = $$2.a($$0, $$1 - $$2.a(xg.u));
      return ue.a().a(xm.a($$3, xg.u));
   }
}
