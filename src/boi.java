public final class boi implements Comparable<boi> {
   public final double a;
   public final double b;
   public final long c;
   public final String d;

   public boi(String $$0, double $$1, double $$2, long $$3) {
      this.d = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public int a(boi $$0) {
      if ($$0.a < this.a) {
         return -1;
      } else {
         return $$0.a > this.a ? 1 : $$0.d.compareTo(this.d);
      }
   }

   public int a() {
      return (this.d.hashCode() & 11184810) + 4473924;
   }
}
