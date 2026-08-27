public class arw {
   public static final int a = 240;
   private final long[] b = new long[240];
   private int c;
   private int d;

   public void a(long $$0) {
      int $$1 = this.b(this.c + this.d);
      this.b[$$1] = $$0;
      if (this.d < 240) {
         this.d++;
      } else {
         this.c = this.b(this.c + 1);
      }
   }

   public int a() {
      return this.b.length;
   }

   public int b() {
      return this.d;
   }

   public long a(int $$0) {
      if ($$0 >= 0 && $$0 < this.d) {
         return this.b[this.b(this.c + $$0)];
      } else {
         throw new IndexOutOfBoundsException($$0 + " out of bounds for length " + this.d);
      }
   }

   private int b(int $$0) {
      return $$0 % 240;
   }

   public void c() {
      this.c = 0;
      this.d = 0;
   }
}
