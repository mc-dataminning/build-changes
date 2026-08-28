import java.util.Set;
import java.util.function.Predicate;

public record cer(Set<drx> b, int c, int d) {
   public static final Predicate<ji<cer>> a = $$0 -> false;

   public cer(Set<drx> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(drx $$0) {
      return this.b.contains($$0);
   }

   public Set<drx> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
