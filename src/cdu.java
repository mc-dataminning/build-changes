import java.util.Set;
import java.util.function.Predicate;

public record cdu(Set<dtc> b, int c, int d) {
   public static final Predicate<ja<cdu>> a = $$0 -> false;

   public cdu(Set<dtc> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dtc $$0) {
      return this.b.contains($$0);
   }

   public Set<dtc> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
