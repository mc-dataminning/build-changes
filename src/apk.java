public record apk(int a, int b) {
   private static final long c = 32L;
   private static final long d = 4294967295L;

   public cyn a() {
      return new cyn(jg.a(this.a), jg.a(this.b));
   }

   public long b() {
      return a(this.a, this.b);
   }

   public static long a(int $$0, int $$1) {
      return (long)$$0 & 4294967295L | ((long)$$1 & 4294967295L) << 32;
   }

   public static int a(long $$0) {
      return (int)($$0 & 4294967295L);
   }

   public static int b(long $$0) {
      return (int)($$0 >>> 32 & 4294967295L);
   }

   @Override
   public String toString() {
      return "[" + this.a + ", " + this.b + "]";
   }

   @Override
   public int hashCode() {
      return cyn.d(this.a, this.b);
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
