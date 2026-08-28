import java.util.Set;
import java.util.function.Predicate;

public record cgm(Set<dwv> b, int c, int d) {
   public static final Predicate<jr<cgm>> a = $$0 -> false;

   public cgm(Set<dwv> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dwv $$0) {
      return this.b.contains($$0);
   }

   public Set<dwv> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
