public class fki extends fmk {
   private final float a;
   private final float b;

   fki(fin $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cix $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public flo b() {
      return flo.a;
   }

   protected fki(fin $$0, double $$1, double $$2, double $$3, cix $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a(eql.O().aq().a($$4, $$0, null, 0).e());
      this.u = 1.0F;
      this.D /= 2.0F;
      this.a = this.r.i() * 3.0F;
      this.b = this.r.i() * 3.0F;
   }

   @Override
   protected float c() {
      return this.E.a((this.a + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.a / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.b / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.b + 1.0F) / 4.0F);
   }

   public static class a implements fln<ir> {
      public flk a(ir $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fki($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.c());
      }
   }

   public static class b implements fln<iy> {
      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fki($$1, $$2, $$3, $$4, new cix(cja.qc));
      }
   }

   public static class c implements fln<iy> {
      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fki($$1, $$2, $$3, $$4, new cix(cja.pO));
      }
   }
}
