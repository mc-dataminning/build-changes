import java.util.Set;
import java.util.function.Predicate;

public record bxt(Set<djp> b, int c, int d) {
   public static final Predicate<ih<bxt>> a = $$0 -> false;

   public bxt(Set<djp> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(djp $$0) {
      return this.b.contains($$0);
   }

   public Set<djp> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
