import java.util.HashSet;
import java.util.Set;

public record abj(Set<kj> c, Set<kj> d) implements aat {
   public static final zh<wg, abj> a = aat.a(abj::a, abj::new);
   public static final aat.b<abj> b = aat.a("debug/village_sections");

   private abj(wg $$0) {
      this($$0.a(HashSet::new, wg::g), $$0.a(HashSet::new, wg::g));
   }

   private void a(wg $$0) {
      $$0.a(this.c, wg::a);
      $$0.a(this.d, wg::a);
   }

   @Override
   public aat.b<abj> a() {
      return b;
   }

   public Set<kj> b() {
      return this.c;
   }

   public Set<kj> c() {
      return this.d;
   }
}
