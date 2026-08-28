public class buk {
   private static final float a = (float) (Math.PI / 12);
   private static final float b = (float) (-Math.PI / 12);
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private final bvh i;

   public buk(bvh $$0) {
      this.i = $$0;
   }

   public void a() {
      this.f = this.c;
      this.g = this.d;
      this.h = this.e;
      float $$3;
      float $$4;
      float $$5;
      if (this.i.fJ()) {
         float $$0 = 1.0F;
         fba $$1 = this.i.dy();
         if ($$1.e < 0.0) {
            fba $$2 = $$1.d();
            $$0 = 1.0F - (float)Math.pow(-$$2.e, 1.5);
         }

         $$3 = ayz.h($$0, (float) (Math.PI / 12), (float) (Math.PI / 9));
         $$4 = ayz.h($$0, (float) (-Math.PI / 12), (float) (-Math.PI / 2));
         $$5 = 0.0F;
      } else if (this.i.ci()) {
         $$3 = (float) (Math.PI * 2.0 / 9.0);
         $$4 = (float) (-Math.PI / 4);
         $$5 = 0.08726646F;
      } else {
         $$3 = (float) (Math.PI / 12);
         $$4 = (float) (-Math.PI / 12);
         $$5 = 0.0F;
      }

      this.c = this.c + ($$3 - this.c) * 0.3F;
      this.d = this.d + ($$5 - this.d) * 0.3F;
      this.e = this.e + ($$4 - this.e) * 0.3F;
   }

   public float a(float $$0) {
      return ayz.h($$0, this.f, this.c);
   }

   public float b(float $$0) {
      return ayz.h($$0, this.g, this.d);
   }

   public float c(float $$0) {
      return ayz.h($$0, this.h, this.e);
   }
}
