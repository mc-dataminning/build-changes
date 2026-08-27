public class few extends fdm {
   private float a = 0.5F;

   public few(wg $$0, fda $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public few(int $$0, int $$1, wg $$2, fda $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public few(int $$0, int $$1, int $$2, int $$3, wg $$4, fda $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public few b(int $$0) {
      super.a($$0);
      return this;
   }

   private few b(float $$0) {
      this.a = $$0;
      return this;
   }

   public few d() {
      return this.b(0.0F);
   }

   public few e() {
      return this.b(0.5F);
   }

   public few f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      wg $$4 = this.y();
      fda $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      aww $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private aww a(wg $$0, int $$1) {
      fda $$2 = this.a();
      wl $$3 = $$2.a($$0, $$1 - $$2.a(wf.u));
      return th.a().a(wl.a($$3, wf.u));
   }
}
