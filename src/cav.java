import java.util.Set;
import java.util.function.Predicate;

public record cav(Set<dnb> b, int c, int d) {
   public static final Predicate<il<cav>> a = $$0 -> false;

   public cav(Set<dnb> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dnb $$0) {
      return this.b.contains($$0);
   }

   public Set<dnb> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
