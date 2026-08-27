import java.util.Set;
import java.util.function.Predicate;

public record cbz(Set<dpi> b, int c, int d) {
   public static final Predicate<in<cbz>> a = $$0 -> false;

   public cbz(Set<dpi> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dpi $$0) {
      return this.b.contains($$0);
   }

   public Set<dpi> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
