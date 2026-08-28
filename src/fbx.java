public class fbx {
   public static final fbx a = new fbx(0.0F, 0.0F);
   public static final fbx b = new fbx(1.0F, 1.0F);
   public static final fbx c = new fbx(1.0F, 0.0F);
   public static final fbx d = new fbx(-1.0F, 0.0F);
   public static final fbx e = new fbx(0.0F, 1.0F);
   public static final fbx f = new fbx(0.0F, -1.0F);
   public static final fbx g = new fbx(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fbx h = new fbx(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fbx(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fbx a(float $$0) {
      return new fbx(this.i * $$0, this.j * $$0);
   }

   public float a(fbx $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fbx b(fbx $$0) {
      return new fbx(this.i + $$0.i, this.j + $$0.j);
   }

   public fbx b(float $$0) {
      return new fbx(this.i + $$0, this.j + $$0);
   }

   public boolean c(fbx $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fbx a() {
      float $$0 = bae.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fbx(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return bae.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fbx $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fbx d() {
      return new fbx(-this.i, -this.j);
   }
}
