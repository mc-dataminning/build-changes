import java.util.Objects;

public final class arf<T> implements Comparable<arf<?>> {
   private final arg<T> a;
   private final int b;
   private final T c;
   private long d;

   protected arf(arg<T> $$0, int $$1, T $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(arf<?> $$0) {
      int $$1 = Integer.compare(this.b, $$0.b);
      if ($$1 != 0) {
         return $$1;
      } else {
         int $$2 = Integer.compare(System.identityHashCode(this.a), System.identityHashCode($$0.a));
         return $$2 != 0 ? $$2 : this.a.a().compare(this.c, (T)$$0.c);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof arf<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.a, $$1.a) && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   @Override
   public String toString() {
      return "Ticket[" + this.a + " " + this.b + " (" + this.c + ")] at " + this.d;
   }

   public arg<T> a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   protected void a(long $$0) {
      this.d = $$0;
   }

   protected boolean b(long $$0) {
      long $$1 = this.a.b();
      return $$1 != 0L && $$0 - this.d > $$1;
   }
}
