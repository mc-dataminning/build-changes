import java.util.Set;
import java.util.function.Predicate;

public record cih(Set<dzz> b, int c, int d) {
   public static final Predicate<je<cih>> a = $$0 -> false;

   public cih(Set<dzz> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dzz $$0) {
      return this.b.contains($$0);
   }

   public Set<dzz> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
