public class etn extends esf {
   private float a = 0.5F;

   public etn(te $$0, erv $$1) {
      this(0, 0, $$1.a($$0.f()), 9, $$0, $$1);
   }

   public etn(int $$0, int $$1, te $$2, erv $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public etn(int $$0, int $$1, int $$2, int $$3, te $$4, erv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public etn h(int $$0) {
      super.a($$0);
      return this;
   }

   private etn b(float $$0) {
      this.a = $$0;
      return this;
   }

   public etn e() {
      return this.b(0.0F);
   }

   public etn f() {
      return this.b(0.5F);
   }

   public etn g() {
      return this.b(1.0F);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      te $$4 = this.l();
      erv $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.h() - 9) / 2;
      ara $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.f();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ara a(te $$0, int $$1) {
      erv $$2 = this.a();
      ti $$3 = $$2.a($$0, $$1 - $$2.a(td.t));
      return qn.a().a(ti.a($$3, td.t));
   }
}
