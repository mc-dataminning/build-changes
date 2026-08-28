import java.util.Set;
import java.util.function.Predicate;

public record ciz(Set<ebe> b, int c, int d) {
   public static final Predicate<jf<ciz>> a = $$0 -> false;

   public ciz(Set<ebe> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(ebe $$0) {
      return this.b.contains($$0);
   }

   public Set<ebe> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
