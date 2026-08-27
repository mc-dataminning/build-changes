public class fmv extends fmw {
   private final gw a;
   private final float b;
   private final float F;

   public fmv(fiz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dfl $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, gw.a($$1, $$2, $$3));
   }

   public fmv(fiz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dfl $$7, gw $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(eqx.O().an().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(csy.i)) {
         int $$9 = eqx.O().aw().a($$7, $$0, $$8, 0);
         this.v *= (float)($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= (float)($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= (float)($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public fma b() {
      return fma.a;
   }

   @Override
   protected float c() {
      return this.E.a((this.b + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.b / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.F / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.F + 1.0F) / 4.0F);
   }

   @Override
   public int a(float $$0) {
      int $$1 = super.a($$0);
      return $$1 == 0 && this.c.A(this.a) ? foe.a(this.c, this.a) : $$1;
   }

   public static class a implements flz<ip> {
      public flw a(ip $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         dfl $$8 = $$0.c();
         return !$$8.i() && !$$8.a(csy.bQ) && $$8.z() ? new fmv($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
      }
   }
}
