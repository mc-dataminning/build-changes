import java.util.Set;
import java.util.function.Predicate;

public record cgn(Set<dww> b, int c, int d) {
   public static final Predicate<jr<cgn>> a = $$0 -> false;

   public cgn(Set<dww> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dww $$0) {
      return this.b.contains($$0);
   }

   public Set<dww> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
