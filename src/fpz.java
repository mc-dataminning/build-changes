public class fpz extends fon {
   private float a = 0.5F;

   public fpz(wo $$0, fob $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fpz(int $$0, int $$1, wo $$2, fob $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fpz(int $$0, int $$1, int $$2, int $$3, wo $$4, fob $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fpz b(int $$0) {
      super.a($$0);
      return this;
   }

   private fpz b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fpz c() {
      return this.b(0.0F);
   }

   public fpz e() {
      return this.b(0.5F);
   }

   public fpz g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      wo $$4 = this.B();
      fob $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayl $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayl a(wo $$0, int $$1) {
      fob $$2 = this.a();
      wt $$3 = $$2.a($$0, $$1 - $$2.a(wn.u));
      return tl.a().a(wt.a($$3, wn.u));
   }
}
