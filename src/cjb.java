import java.util.Set;
import java.util.function.Predicate;

public record cjb(Set<ebg> b, int c, int d) {
   public static final Predicate<jg<cjb>> a = $$0 -> false;

   public cjb(Set<ebg> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(ebg $$0) {
      return this.b.contains($$0);
   }

   public Set<ebg> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
