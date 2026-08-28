import java.util.Set;
import java.util.function.Predicate;

public record cio(Set<eao> b, int c, int d) {
   public static final Predicate<jf<cio>> a = $$0 -> false;

   public cio(Set<eao> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(eao $$0) {
      return this.b.contains($$0);
   }

   public Set<eao> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
