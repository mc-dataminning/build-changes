import java.util.Set;
import java.util.function.Predicate;

public record cex(Set<dsd> b, int c, int d) {
   public static final Predicate<ji<cex>> a = $$0 -> false;

   public cex(Set<dsd> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsd $$0) {
      return this.b.contains($$0);
   }

   public Set<dsd> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
