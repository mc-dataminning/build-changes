import java.util.Set;
import java.util.function.Predicate;

public record cgp(Set<dwy> b, int c, int d) {
   public static final Predicate<jr<cgp>> a = $$0 -> false;

   public cgp(Set<dwy> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dwy $$0) {
      return this.b.contains($$0);
   }

   public Set<dwy> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
