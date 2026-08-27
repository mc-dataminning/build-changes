import java.util.Set;
import java.util.function.Predicate;

public record bzo(Set<dlj> b, int c, int d) {
   public static final Predicate<ij<bzo>> a = $$0 -> false;

   public bzo(Set<dlj> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dlj $$0) {
      return this.b.contains($$0);
   }

   public Set<dlj> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
