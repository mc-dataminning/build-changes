import java.util.Set;
import java.util.function.Predicate;

public record chi(Set<dxn> b, int c, int d) {
   public static final Predicate<jq<chi>> a = $$0 -> false;

   public chi(Set<dxn> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dxn $$0) {
      return this.b.contains($$0);
   }

   public Set<dxn> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
