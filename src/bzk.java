import java.util.Set;
import java.util.function.Predicate;

public record bzk(Set<dlf> b, int c, int d) {
   public static final Predicate<ij<bzk>> a = $$0 -> false;

   public bzk(Set<dlf> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dlf $$0) {
      return this.b.contains($$0);
   }

   public Set<dlf> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
