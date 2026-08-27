public class etw extends esn {
   private float a = 0.5F;

   public etw(tl $$0, esd $$1) {
      this(0, 0, $$1.a($$0.f()), 9, $$0, $$1);
   }

   public etw(int $$0, int $$1, tl $$2, esd $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public etw(int $$0, int $$1, int $$2, int $$3, tl $$4, esd $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public etw i(int $$0) {
      super.a($$0);
      return this;
   }

   private etw b(float $$0) {
      this.a = $$0;
      return this;
   }

   public etw e() {
      return this.b(0.0F);
   }

   public etw f() {
      return this.b(0.5F);
   }

   public etw g() {
      return this.b(1.0F);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      tl $$4 = this.m();
      esd $$5 = this.a();
      int $$6 = this.l();
      int $$7 = $$5.a($$4);
      int $$8 = this.r() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.t() + (this.i() - 9) / 2;
      ark $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.f();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ark a(tl $$0, int $$1) {
      esd $$2 = this.a();
      tp $$3 = $$2.a($$0, $$1 - $$2.a(tk.t));
      return qs.a().a(tp.a($$3, tk.t));
   }
}
