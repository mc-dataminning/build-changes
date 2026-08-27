public class bhx {
   public static final int a = 240;
   private final long[][] b;
   private int c;
   private int d;

   public bhx(int $$0) {
      this.b = new long[240][$$0];
   }

   public void a(long $$0) {
      int $$1 = this.b(this.c + this.d);
      this.b[$$1][0] = $$0;
      if (this.d < 240) {
         this.d++;
      } else {
         this.c = this.b(this.c + 1);
      }
   }

   public void a(long $$0, int $$1) {
      int $$2 = this.b(this.c + this.d);
      long[] $$3 = this.b[$$2];
      if ($$1 >= 1 && $$1 < $$3.length) {
         $$3[$$1] = $$0;
      } else {
         throw new IndexOutOfBoundsException($$1 + " out of bounds for dimensions " + $$3.length);
      }
   }

   public int a() {
      return this.b.length;
   }

   public int b() {
      return this.d;
   }

   public long a(int $$0) {
      return this.a($$0, 0);
   }

   public long a(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 < this.d) {
         long[] $$2 = this.b[this.b(this.c + $$0)];
         if ($$1 >= 0 && $$1 < $$2.length) {
            return $$2[$$1];
         } else {
            throw new IndexOutOfBoundsException($$1 + " out of bounds for dimensions " + $$2.length);
         }
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
