import java.util.Set;
import java.util.function.Predicate;

public record btz(Set<dey> b, int c, int d) {
   public static final Predicate<hf<btz>> a = $$0 -> false;

   public btz(Set<dey> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dey $$0) {
      return this.b.contains($$0);
   }

   public Set<dey> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
