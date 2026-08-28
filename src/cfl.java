import java.util.Set;
import java.util.function.Predicate;

public record cfl(Set<dua> b, int c, int d) {
   public static final Predicate<jn<cfl>> a = $$0 -> false;

   public cfl(Set<dua> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dua $$0) {
      return this.b.contains($$0);
   }

   public Set<dua> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
