import java.util.Set;
import java.util.function.Predicate;

public record cie(Set<dzo> b, int c, int d) {
   public static final Predicate<je<cie>> a = $$0 -> false;

   public cie(Set<dzo> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dzo $$0) {
      return this.b.contains($$0);
   }

   public Set<dzo> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
