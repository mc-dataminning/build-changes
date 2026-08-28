import java.util.Set;
import java.util.function.Predicate;

public record cej(Set<dsl> b, int c, int d) {
   public static final Predicate<jj<cej>> a = $$0 -> false;

   public cej(Set<dsl> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsl $$0) {
      return this.b.contains($$0);
   }

   public Set<dsl> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
