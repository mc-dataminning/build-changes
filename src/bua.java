import java.util.Set;
import java.util.function.Predicate;

public record bua(Set<dez> b, int c, int d) {
   public static final Predicate<he<bua>> a = $$0 -> false;

   public bua(Set<dez> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dez $$0) {
      return this.b.contains($$0);
   }

   public Set<dez> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
