import java.util.Set;
import java.util.function.Predicate;

public record cgc(Set<dvd> b, int c, int d) {
   public static final Predicate<jp<cgc>> a = $$0 -> false;

   public cgc(Set<dvd> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dvd $$0) {
      return this.b.contains($$0);
   }

   public Set<dvd> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
