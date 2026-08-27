public class aoo {
   public static final int a = 240;
   private final long[] b = new long[240];
   private int c;
   private int d;
   private int e;

   public void a(long $$0) {
      this.b[this.e] = $$0;
      this.e++;
      if (this.e == 240) {
         this.e = 0;
      }

      if (this.d < 240) {
         this.c = 0;
         this.d++;
      } else {
         this.c = this.b(this.e + 1);
      }
   }

   public long a(int $$0) {
      int $$1 = (this.c + $$0) % 240;
      int $$2 = this.c;

      long $$3;
      for ($$3 = 0L; $$2 != $$1; $$2++) {
         $$3 += this.b[$$2];
      }

      return $$3 / (long)$$0;
   }

   public int a(int $$0, int $$1) {
      return this.a(this.a($$0), $$1, 60);
   }

   public int a(long $$0, int $$1, int $$2) {
      double $$3 = (double)$$0 / (double)(1000000000L / (long)$$2);
      return (int)($$3 * (double)$$1);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.e;
   }

   public int b(int $$0) {
      return $$0 % 240;
   }

   public long[] c() {
      return this.b;
   }
}
