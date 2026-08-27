import java.util.Set;
import java.util.function.Predicate;

public record bwn(Set<dhn> b, int c, int d) {
   public static final Predicate<ig<bwn>> a = $$0 -> false;

   public bwn(Set<dhn> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dhn $$0) {
      return this.b.contains($$0);
   }

   public Set<dhn> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
