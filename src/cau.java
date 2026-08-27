import java.util.Set;
import java.util.function.Predicate;

public record cau(Set<dmz> b, int c, int d) {
   public static final Predicate<il<cau>> a = $$0 -> false;

   public cau(Set<dmz> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dmz $$0) {
      return this.b.contains($$0);
   }

   public Set<dmz> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
