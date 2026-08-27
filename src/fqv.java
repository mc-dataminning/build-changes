public class fqv extends fqw {
   private final hv a;
   private final float b;
   private final float F;

   public fqv(fmt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dip $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, hv.a($$1, $$2, $$3));
   }

   public fqv(fmt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dip $$7, hv $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(euk.N().am().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(cwb.i)) {
         int $$9 = euk.N().at().a($$7, $$0, $$8, 0);
         this.v *= (float)($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= (float)($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= (float)($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public fqa b() {
      return fqa.a;
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
      return $$1 == 0 && this.c.A(this.a) ? fsg.a(this.c, this.a) : $$1;
   }

   public static class a implements fpz<jn> {
      public fpw a(jn $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         dip $$8 = $$0.c();
         return !$$8.i() && !$$8.a(cwb.bQ) && $$8.z() ? new fqv($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
      }
   }
}
