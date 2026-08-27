import java.util.Set;
import java.util.function.Predicate;

public record bui(Set<dfj> b, int c, int d) {
   public static final Predicate<he<bui>> a = $$0 -> false;

   public bui(Set<dfj> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dfj $$0) {
      return this.b.contains($$0);
   }

   public Set<dfj> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
