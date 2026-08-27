public class etm extends ese {
   private float a = 0.5F;

   public etm(tf $$0, eru $$1) {
      this(0, 0, $$1.a($$0.f()), 9, $$0, $$1);
   }

   public etm(int $$0, int $$1, tf $$2, eru $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public etm(int $$0, int $$1, int $$2, int $$3, tf $$4, eru $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public etm h(int $$0) {
      super.a($$0);
      return this;
   }

   private etm b(float $$0) {
      this.a = $$0;
      return this;
   }

   public etm e() {
      return this.b(0.0F);
   }

   public etm f() {
      return this.b(0.5F);
   }

   public etm g() {
      return this.b(1.0F);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      tf $$4 = this.l();
      eru $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.h() - 9) / 2;
      arc $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.f();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private arc a(tf $$0, int $$1) {
      eru $$2 = this.a();
      tj $$3 = $$2.a($$0, $$1 - $$2.a(te.t));
      return qm.a().a(tj.a($$3, te.t));
   }
}
