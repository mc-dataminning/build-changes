import java.util.Set;
import java.util.function.Predicate;

public record bxp(Set<djh> b, int c, int d) {
   public static final Predicate<ih<bxp>> a = $$0 -> false;

   public bxp(Set<djh> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(djh $$0) {
      return this.b.contains($$0);
   }

   public Set<djh> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
