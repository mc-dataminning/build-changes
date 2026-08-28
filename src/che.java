import java.util.Set;
import java.util.function.Predicate;

public record che(Set<dxo> b, int c, int d) {
   public static final Predicate<jq<che>> a = $$0 -> false;

   public che(Set<dxo> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dxo $$0) {
      return this.b.contains($$0);
   }

   public Set<dxo> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
