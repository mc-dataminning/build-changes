import java.util.Set;
import java.util.function.Predicate;

public record cet(Set<dta> b, int c, int d) {
   public static final Predicate<jm<cet>> a = $$0 -> false;

   public cet(Set<dta> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dta $$0) {
      return this.b.contains($$0);
   }

   public Set<dta> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
