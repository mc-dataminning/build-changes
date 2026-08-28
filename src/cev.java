import java.util.Set;
import java.util.function.Predicate;

public record cev(Set<dsb> b, int c, int d) {
   public static final Predicate<ji<cev>> a = $$0 -> false;

   public cev(Set<dsb> b, int c, int d) {
      b = Set.copyOf(b);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public boolean a(dsb $$0) {
      return this.b.contains($$0);
   }

   public Set<dsb> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
