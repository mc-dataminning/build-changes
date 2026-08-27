public class fld<T extends is> extends fmu {
   private final fmp a;

   protected fld(fix $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, T $$7, fmp $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.C = true;
      this.a = $$8;
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      float $$9 = this.r.i() * 0.4F + 0.6F;
      this.v = this.a($$7.e().x(), $$9);
      this.w = this.a($$7.e().y(), $$9);
      this.x = this.a($$7.e().z(), $$9);
      this.D = this.D * 0.75F * $$7.f();
      int $$10 = (int)(8.0 / (this.r.j() * 0.8 + 0.2));
      this.t = (int)Math.max((float)$$10 * $$7.f(), 1.0F);
      this.b($$8);
   }

   protected float a(float $$0, float $$1) {
      return (this.r.i() * 0.2F + 0.8F) * $$0 * $$1;
   }

   @Override
   public fly b() {
      return fly.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * arx.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }
}
