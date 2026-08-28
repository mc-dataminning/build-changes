import java.util.HashSet;
import java.util.Set;

public record abc(Set<jz> c, Set<jz> d) implements aam {
   public static final za<vy, abc> a = aam.a(abc::a, abc::new);
   public static final aam.b<abc> b = aam.a("debug/village_sections");

   private abc(vy $$0) {
      this($$0.a(HashSet::new, vy::g), $$0.a(HashSet::new, vy::g));
   }

   private void a(vy $$0) {
      $$0.a(this.c, vy::a);
      $$0.a(this.d, vy::a);
   }

   @Override
   public aam.b<abc> a() {
      return b;
   }

   public Set<jz> b() {
      return this.c;
   }

   public Set<jz> c() {
      return this.d;
   }
}
