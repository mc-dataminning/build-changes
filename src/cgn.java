import java.util.Set;
import java.util.function.Predicate;

public record cgn(Set<dwx> b, int c, int d) {
   public static final Predicate<jr<cgn>> a = $$0 -> false;

   public cgn(Set<dwx> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dwx $$0) {
      return this.b.contains($$0);
   }

   public Set<dwx> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
