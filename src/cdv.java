import java.util.Set;
import java.util.function.Predicate;

public record cdv(Set<drb> b, int c, int d) {
   public static final Predicate<ix<cdv>> a = $$0 -> false;

   public cdv(Set<drb> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(drb $$0) {
      return this.b.contains($$0);
   }

   public Set<drb> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
