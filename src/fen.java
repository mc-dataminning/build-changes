import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;

public class fen {
   public float a;
   public float b;
   private long c;
   private final float d;
   private final FloatUnaryOperator e;

   public fen(float $$0, long $$1, FloatUnaryOperator $$2) {
      this.d = 1000.0F / $$0;
      this.c = $$1;
      this.e = $$2;
   }

   public int a(long $$0) {
      this.b = (float)($$0 - this.c) / this.e.apply(this.d);
      this.c = $$0;
      this.a = this.a + this.b;
      int $$1 = (int)this.a;
      this.a -= (float)$$1;
      return $$1;
   }
}
