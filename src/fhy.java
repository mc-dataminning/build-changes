public class fhy {
   private final int[] a;
   private final int[] b;
   private int c;
   private int d;

   public fhy(int $$0) {
      this.a = new int[$$0];
      this.b = new int[$$0];
   }

   public void a(int $$0, long $$1) {
      this.a[this.c] = $$0;
      this.b[this.c] = (int)aro.a((float)$$1, 0.0F, 15000.0F);
      this.c = (this.c + 1) % this.a.length;
      if (this.d < this.a.length) {
         this.d++;
      }
   }

   public double a() {
      int $$0 = 0;
      int $$1 = 0;

      for (int $$2 = 0; $$2 < Math.min(this.d, this.a.length); $$2++) {
         $$0 += this.a[$$2];
         $$1 += this.b[$$2];
      }

      return (double)$$1 * 1.0 / (double)$$0;
   }
}
