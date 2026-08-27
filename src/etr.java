public class etr extends esi {
   private float a = 0.5F;

   public etr(ti $$0, ery $$1) {
      this(0, 0, $$1.a($$0.f()), 9, $$0, $$1);
   }

   public etr(int $$0, int $$1, ti $$2, ery $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public etr(int $$0, int $$1, int $$2, int $$3, ti $$4, ery $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public etr i(int $$0) {
      super.a($$0);
      return this;
   }

   private etr b(float $$0) {
      this.a = $$0;
      return this;
   }

   public etr e() {
      return this.b(0.0F);
   }

   public etr f() {
      return this.b(0.5F);
   }

   public etr g() {
      return this.b(1.0F);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      ti $$4 = this.m();
      ery $$5 = this.a();
      int $$6 = this.l();
      int $$7 = $$5.a($$4);
      int $$8 = this.r() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.t() + (this.i() - 9) / 2;
      arf $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.f();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private arf a(ti $$0, int $$1) {
      ery $$2 = this.a();
      tm $$3 = $$2.a($$0, $$1 - $$2.a(th.t));
      return qp.a().a(tm.a($$3, th.t));
   }
}
