import java.util.Set;
import java.util.function.Predicate;

public record chf(Set<dxq> b, int c, int d) {
   public static final Predicate<jr<chf>> a = $$0 -> false;

   public chf(Set<dxq> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dxq $$0) {
      return this.b.contains($$0);
   }

   public Set<dxq> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
