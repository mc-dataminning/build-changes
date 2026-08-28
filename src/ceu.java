import java.util.Set;
import java.util.function.Predicate;

public record ceu(Set<dsa> b, int c, int d) {
   public static final Predicate<ji<ceu>> a = $$0 -> false;

   public ceu(Set<dsa> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsa $$0) {
      return this.b.contains($$0);
   }

   public Set<dsa> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
