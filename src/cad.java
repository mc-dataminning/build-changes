import java.util.Set;
import java.util.function.Predicate;

public record cad(Set<dme> b, int c, int d) {
   public static final Predicate<il<cad>> a = $$0 -> false;

   public cad(Set<dme> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dme $$0) {
      return this.b.contains($$0);
   }

   public Set<dme> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
