import java.util.HashSet;
import java.util.Set;

public record aaw(Set<jx> c, Set<jx> d) implements aag {
   public static final yu<vs, aaw> a = aag.a(aaw::a, aaw::new);
   public static final aag.b<aaw> b = aag.a("debug/village_sections");

   private aaw(vs $$0) {
      this($$0.a(HashSet::new, vs::g), $$0.a(HashSet::new, vs::g));
   }

   private void a(vs $$0) {
      $$0.a(this.c, vs::a);
      $$0.a(this.d, vs::a);
   }

   @Override
   public aag.b<aaw> a() {
      return b;
   }

   public Set<jx> b() {
      return this.c;
   }

   public Set<jx> c() {
      return this.d;
   }
}
