import java.util.Set;
import java.util.function.Predicate;

public record bub(Set<dfa> b, int c, int d) {
   public static final Predicate<he<bub>> a = $$0 -> false;

   public bub(Set<dfa> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dfa $$0) {
      return this.b.contains($$0);
   }

   public Set<dfa> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
