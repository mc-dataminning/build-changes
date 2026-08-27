import java.util.Set;
import java.util.function.Predicate;

public record bwz(Set<dip> b, int c, int d) {
   public static final Predicate<ie<bwz>> a = $$0 -> false;

   public bwz(Set<dip> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dip $$0) {
      return this.b.contains($$0);
   }

   public Set<dip> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
