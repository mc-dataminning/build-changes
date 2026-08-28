import java.util.HashSet;
import java.util.Set;

public record abj(Set<jz> c, Set<jz> d) implements aat {
   public static final ze<vy, abj> a = aat.a(abj::a, abj::new);
   public static final aat.b<abj> b = aat.a("debug/village_sections");

   private abj(vy $$0) {
      this($$0.a(HashSet::new, vy::g), $$0.a(HashSet::new, vy::g));
   }

   private void a(vy $$0) {
      $$0.a(this.c, vy::a);
      $$0.a(this.d, vy::a);
   }

   @Override
   public aat.b<abj> a() {
      return b;
   }

   public Set<jz> b() {
      return this.c;
   }

   public Set<jz> c() {
      return this.d;
   }
}
