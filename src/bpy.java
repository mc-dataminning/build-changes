public class bpy {
   public static final bpy a = new bpy(0.75F, 0.5F, 0.25F);
   public static final bpy b = new bpy(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bpy(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bpy.a a(float $$0) {
      if ($$0 < this.e) {
         return bpy.a.d;
      } else if ($$0 < this.d) {
         return bpy.a.c;
      } else {
         return $$0 < this.c ? bpy.a.b : bpy.a.a;
      }
   }

   public bpy.a a(crs $$0) {
      return !$$0.k() ? bpy.a.a : this.a($$0.m(), $$0.n());
   }

   public bpy.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
