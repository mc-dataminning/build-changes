public class fqx extends fpm {
   private float a = 0.5F;

   public fqx(wp $$0, fpa $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fqx(int $$0, int $$1, wp $$2, fpa $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fqx(int $$0, int $$1, int $$2, int $$3, wp $$4, fpa $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fqx b(int $$0) {
      super.a($$0);
      return this;
   }

   private fqx b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fqx c() {
      return this.b(0.0F);
   }

   public fqx e() {
      return this.b(0.5F);
   }

   public fqx g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      wp $$4 = this.B();
      fpa $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayl $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayl a(wp $$0, int $$1) {
      fpa $$2 = this.a();
      wu $$3 = $$2.a($$0, $$1 - $$2.a(wo.u));
      return tl.a().a(wu.a($$3, wo.u));
   }
}
