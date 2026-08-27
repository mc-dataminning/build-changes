public class ety extends esp {
   private float a = 0.5F;

   public ety(tn $$0, esf $$1) {
      this(0, 0, $$1.a($$0.f()), 9, $$0, $$1);
   }

   public ety(int $$0, int $$1, tn $$2, esf $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public ety(int $$0, int $$1, int $$2, int $$3, tn $$4, esf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public ety i(int $$0) {
      super.a($$0);
      return this;
   }

   private ety b(float $$0) {
      this.a = $$0;
      return this;
   }

   public ety e() {
      return this.b(0.0F);
   }

   public ety f() {
      return this.b(0.5F);
   }

   public ety g() {
      return this.b(1.0F);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      tn $$4 = this.m();
      esf $$5 = this.a();
      int $$6 = this.l();
      int $$7 = $$5.a($$4);
      int $$8 = this.r() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.t() + (this.i() - 9) / 2;
      arl $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.f();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private arl a(tn $$0, int $$1) {
      esf $$2 = this.a();
      tr $$3 = $$2.a($$0, $$1 - $$2.a(tm.t));
      return qt.a().a(tr.a($$3, tm.t));
   }
}
