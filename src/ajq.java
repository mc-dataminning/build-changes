public class ajq implements Comparable<ajq> {
   private final int a;
   private final gv b;
   private int c;
   private int d;

   public ajq(int $$0, gv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.a;
   }

   public gv b() {
      return this.b;
   }

   public void a(int $$0) {
      if ($$0 > 10) {
         $$0 = 10;
      }

      this.c = $$0;
   }

   public int c() {
      return this.c;
   }

   public void b(int $$0) {
      this.d = $$0;
   }

   public int d() {
      return this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ajq $$1 = (ajq)$$0;
         return this.a == $$1.a;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.a);
   }

   public int a(ajq $$0) {
      return this.c != $$0.c ? Integer.compare(this.c, $$0.c) : Integer.compare(this.a, $$0.a);
   }
}
