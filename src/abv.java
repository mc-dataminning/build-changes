import java.util.HashSet;
import java.util.Set;

public record abv(Set<kj> c, Set<kj> d) implements abf {
   public static final zt<ws, abv> a = abf.a(abv::a, abv::new);
   public static final abf.b<abv> b = abf.a("debug/village_sections");

   private abv(ws $$0) {
      this($$0.a(HashSet::new, ws::g), $$0.a(HashSet::new, ws::g));
   }

   private void a(ws $$0) {
      $$0.a(this.c, ws::a);
      $$0.a(this.d, ws::a);
   }

   @Override
   public abf.b<abv> a() {
      return b;
   }

   public Set<kj> b() {
      return this.c;
   }

   public Set<kj> c() {
      return this.d;
   }
}
