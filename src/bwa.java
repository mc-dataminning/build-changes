import java.util.Set;
import java.util.function.Predicate;

public record bwa(Set<dgw> b, int c, int d) {
   public static final Predicate<ib<bwa>> a = $$0 -> false;

   public bwa(Set<dgw> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dgw $$0) {
      return this.b.contains($$0);
   }

   public Set<dgw> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
