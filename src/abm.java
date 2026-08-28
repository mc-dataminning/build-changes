import java.util.HashSet;
import java.util.Set;

public record abm(Set<kb> c, Set<kb> d) implements aax {
   public static final zn<wm, abm> a = aax.a(abm::a, abm::new);
   public static final aax.b<abm> b = aax.a("debug/village_sections");

   private abm(wm $$0) {
      this($$0.a(HashSet::new, wm::g), $$0.a(HashSet::new, wm::g));
   }

   private void a(wm $$0) {
      $$0.a(this.c, wm::a);
      $$0.a(this.d, wm::a);
   }

   @Override
   public aax.b<abm> a() {
      return b;
   }

   public Set<kb> b() {
      return this.c;
   }

   public Set<kb> c() {
      return this.d;
   }
}
