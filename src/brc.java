import java.util.Set;
import java.util.function.Predicate;

public record brc(Set<dcb> b, int c, int d) {
   public static final Predicate<he<brc>> a = $$0 -> false;

   public brc(Set<dcb> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dcb $$0) {
      return this.b.contains($$0);
   }

   public Set<dcb> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
