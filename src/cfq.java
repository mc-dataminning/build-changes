import java.util.Set;
import java.util.function.Predicate;

public record cfq(Set<duo> b, int c, int d) {
   public static final Predicate<jn<cfq>> a = $$0 -> false;

   public cfq(Set<duo> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(duo $$0) {
      return this.b.contains($$0);
   }

   public Set<duo> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
