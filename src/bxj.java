import java.util.Set;
import java.util.function.Predicate;

public record bxj(Set<dja> b, int c, int d) {
   public static final Predicate<ih<bxj>> a = $$0 -> false;

   public bxj(Set<dja> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dja $$0) {
      return this.b.contains($$0);
   }

   public Set<dja> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
