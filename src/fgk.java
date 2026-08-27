public class fgk extends fim {
   private final float a;
   private final float b;

   fgk(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cfz $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public fhq b() {
      return fhq.a;
   }

   protected fgk(few $$0, double $$1, double $$2, double $$3, cfz $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a(enn.N().ap().a($$4, $$0, null, 0).e());
      this.u = 1.0F;
      this.D /= 2.0F;
      this.a = this.r.i() * 3.0F;
      this.b = this.r.i() * 3.0F;
   }

   @Override
   protected float c() {
      return this.E.a((double)((this.a + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   protected float d() {
      return this.E.a((double)(this.a / 4.0F * 16.0F));
   }

   @Override
   protected float e() {
      return this.E.b((double)(this.b / 4.0F * 16.0F));
   }

   @Override
   protected float f() {
      return this.E.b((double)((this.b + 1.0F) / 4.0F * 16.0F));
   }

   public static class a implements fhp<ir> {
      public fhm a(ir $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fgk($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.c());
      }
   }

   public static class b implements fhp<iy> {
      public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fgk($$1, $$2, $$3, $$4, new cfz(cgc.qc));
      }
   }

   public static class c implements fhp<iy> {
      public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fgk($$1, $$2, $$3, $$4, new cfz(cgc.pO));
      }
   }
}
