import java.util.Set;
import java.util.function.Predicate;

public record cey(Set<dse> b, int c, int d) {
   public static final Predicate<ji<cey>> a = $$0 -> false;

   public cey(Set<dse> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dse $$0) {
      return this.b.contains($$0);
   }

   public Set<dse> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
