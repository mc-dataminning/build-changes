import java.util.HashSet;
import java.util.Set;

public record abh(Set<ki> c, Set<ki> d) implements aar {
   public static final zf<we, abh> a = aar.a(abh::a, abh::new);
   public static final aar.b<abh> b = aar.a("debug/village_sections");

   private abh(we $$0) {
      this($$0.a(HashSet::new, we::g), $$0.a(HashSet::new, we::g));
   }

   private void a(we $$0) {
      $$0.a(this.c, we::a);
      $$0.a(this.d, we::a);
   }

   @Override
   public aar.b<abh> a() {
      return b;
   }

   public Set<ki> b() {
      return this.c;
   }

   public Set<ki> c() {
      return this.d;
   }
}
