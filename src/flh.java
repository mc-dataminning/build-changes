public class flh extends fmq {
   flh(fis $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.C = true;
      this.B = 0.86F;
      this.j *= 0.01F;
      this.k *= 0.01F;
      this.l *= 0.01F;
      this.k += 0.1;
      this.D *= 1.5F;
      this.t = 16;
      this.n = false;
   }

   @Override
   public flu b() {
      return flu.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * asb.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   public static class a implements flt<iy> {
      private final fml a;

      public a(fml $$0) {
         this.a = $$0;
      }

      public flq a(iy $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flh $$8 = new flh($$1, $$2, $$3 + 0.5, $$4);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         return $$8;
      }
   }

   public static class b implements flt<iy> {
      private final fml a;

      public b(fml $$0) {
         this.a = $$0;
      }

      public flq a(iy $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flh $$8 = new flh($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }
}
