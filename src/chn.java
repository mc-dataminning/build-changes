import java.util.Set;
import java.util.function.Predicate;

public record chn(Set<dxv> b, int c, int d) {
   public static final Predicate<jq<chn>> a = $$0 -> false;

   public chn(Set<dxv> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dxv $$0) {
      return this.b.contains($$0);
   }

   public Set<dxv> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
