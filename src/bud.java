import java.util.Set;
import java.util.function.Predicate;

public record bud(Set<dfe> b, int c, int d) {
   public static final Predicate<hg<bud>> a = $$0 -> false;

   public bud(Set<dfe> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dfe $$0) {
      return this.b.contains($$0);
   }

   public Set<dfe> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
