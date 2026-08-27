import java.util.Set;
import java.util.function.Predicate;

public record bvl(Set<dgb> b, int c, int d) {
   public static final Predicate<ib<bvl>> a = $$0 -> false;

   public bvl(Set<dgb> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dgb $$0) {
      return this.b.contains($$0);
   }

   public Set<dgb> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
