public class aae implements vf<wy> {
   private final float a;
   private final int b;
   private final float c;

   public aae(float $$0, int $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aae(sq $$0) {
      this.a = $$0.readFloat();
      this.b = $$0.m();
      this.c = $$0.readFloat();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
