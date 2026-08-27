import java.util.Set;
import java.util.function.Predicate;

public record buo(Set<dfd> b, int c, int d) {
   public static final Predicate<he<buo>> a = $$0 -> false;

   public buo(Set<dfd> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dfd $$0) {
      return this.b.contains($$0);
   }

   public Set<dfd> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
