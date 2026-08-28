import java.util.Set;
import java.util.function.Predicate;

public record cio(Set<eat> b, int c, int d) {
   public static final Predicate<jf<cio>> a = $$0 -> false;

   public cio(Set<eat> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(eat $$0) {
      return this.b.contains($$0);
   }

   public Set<eat> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
