import java.util.Set;
import java.util.function.Predicate;

public record cew(Set<dsc> b, int c, int d) {
   public static final Predicate<ji<cew>> a = $$0 -> false;

   public cew(Set<dsc> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsc $$0) {
      return this.b.contains($$0);
   }

   public Set<dsc> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
