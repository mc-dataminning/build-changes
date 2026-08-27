import java.util.Set;
import java.util.function.Predicate;

public record cdx(Set<drd> b, int c, int d) {
   public static final Predicate<ix<cdx>> a = $$0 -> false;

   public cdx(Set<drd> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(drd $$0) {
      return this.b.contains($$0);
   }

   public Set<drd> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
