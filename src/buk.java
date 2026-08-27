import java.util.Set;
import java.util.function.Predicate;

public record buk(Set<dfl> b, int c, int d) {
   public static final Predicate<hg<buk>> a = $$0 -> false;

   public buk(Set<dfl> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dfl $$0) {
      return this.b.contains($$0);
   }

   public Set<dfl> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
