import java.util.Set;
import java.util.function.Predicate;

public record bwi(Set<dhi> b, int c, int d) {
   public static final Predicate<ib<bwi>> a = $$0 -> false;

   public bwi(Set<dhi> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dhi $$0) {
      return this.b.contains($$0);
   }

   public Set<dhi> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
