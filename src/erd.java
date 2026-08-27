public class erd {
   public float a;
   public float b;
   private long c;
   private final float d;

   public erd(float $$0, long $$1) {
      this.d = 1000.0F / $$0;
      this.c = $$1;
   }

   public int a(long $$0) {
      this.b = (float)($$0 - this.c) / this.d;
      this.c = $$0;
      this.a = this.a + this.b;
      int $$1 = (int)this.a;
      this.a -= (float)$$1;
      return $$1;
   }
}
