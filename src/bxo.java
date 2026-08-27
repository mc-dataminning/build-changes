import java.util.Set;
import java.util.function.Predicate;

public record bxo(Set<djg> b, int c, int d) {
   public static final Predicate<ih<bxo>> a = $$0 -> false;

   public bxo(Set<djg> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(djg $$0) {
      return this.b.contains($$0);
   }

   public Set<djg> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
