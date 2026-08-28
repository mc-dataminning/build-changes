import java.util.Set;
import java.util.function.Predicate;

public record cjk(Set<ebq> b, int c, int d) {
   public static final Predicate<jg<cjk>> a = $$0 -> false;

   public cjk(Set<ebq> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(ebq $$0) {
      return this.b.contains($$0);
   }

   public Set<ebq> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
