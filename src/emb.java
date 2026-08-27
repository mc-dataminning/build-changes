public class emb {
   public static final emb a = new emb(0.0F, 0.0F);
   public static final emb b = new emb(1.0F, 1.0F);
   public static final emb c = new emb(1.0F, 0.0F);
   public static final emb d = new emb(-1.0F, 0.0F);
   public static final emb e = new emb(0.0F, 1.0F);
   public static final emb f = new emb(0.0F, -1.0F);
   public static final emb g = new emb(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final emb h = new emb(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public emb(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public emb a(float $$0) {
      return new emb(this.i * $$0, this.j * $$0);
   }

   public float a(emb $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public emb b(emb $$0) {
      return new emb(this.i + $$0.i, this.j + $$0.j);
   }

   public emb b(float $$0) {
      return new emb(this.i + $$0, this.j + $$0);
   }

   public boolean c(emb $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public emb a() {
      float $$0 = aup.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new emb(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aup.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(emb $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public emb d() {
      return new emb(-this.i, -this.j);
   }
}
