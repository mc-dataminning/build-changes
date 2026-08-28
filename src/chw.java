import java.util.Set;
import java.util.function.Predicate;

public record chw(Set<dym> b, int c, int d) {
   public static final Predicate<js<chw>> a = $$0 -> false;

   public chw(Set<dym> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dym $$0) {
      return this.b.contains($$0);
   }

   public Set<dym> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
