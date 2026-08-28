import java.util.Set;
import java.util.function.Predicate;

public record cei(Set<dsk> b, int c, int d) {
   public static final Predicate<jj<cei>> a = $$0 -> false;

   public cei(Set<dsk> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsk $$0) {
      return this.b.contains($$0);
   }

   public Set<dsk> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
