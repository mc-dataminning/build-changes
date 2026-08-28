import java.util.Set;
import java.util.function.Predicate;

public record cef(Set<dsh> b, int c, int d) {
   public static final Predicate<jj<cef>> a = $$0 -> false;

   public cef(Set<dsh> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsh $$0) {
      return this.b.contains($$0);
   }

   public Set<dsh> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
