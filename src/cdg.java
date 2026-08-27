import java.util.Set;
import java.util.function.Predicate;

public record cdg(Set<dqh> b, int c, int d) {
   public static final Predicate<iw<cdg>> a = $$0 -> false;

   public cdg(Set<dqh> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dqh $$0) {
      return this.b.contains($$0);
   }

   public Set<dqh> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
