import java.util.Set;
import java.util.function.Predicate;

public record cbu(Set<doz> b, int c, int d) {
   public static final Predicate<il<cbu>> a = $$0 -> false;

   public cbu(Set<doz> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(doz $$0) {
      return this.b.contains($$0);
   }

   public Set<doz> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
