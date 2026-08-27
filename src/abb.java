import java.util.HashSet;
import java.util.Set;

public record abb(Set<jt> c, Set<jt> d) implements aam {
   public static final zc<we, abb> a = aam.a(abb::a, abb::new);
   public static final aam.b<abb> b = aam.a("debug/village_sections");

   private abb(we $$0) {
      this($$0.a(HashSet::new, we::g), $$0.a(HashSet::new, we::g));
   }

   private void a(we $$0) {
      $$0.a(this.c, we::a);
      $$0.a(this.d, we::a);
   }

   @Override
   public aam.b<abb> a() {
      return b;
   }

   public Set<jt> b() {
      return this.c;
   }

   public Set<jt> c() {
      return this.d;
   }
}
