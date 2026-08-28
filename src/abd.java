import java.util.HashSet;
import java.util.Set;

public record abd(Set<kg> c, Set<kg> d) implements aan {
   public static final zb<wa, abd> a = aan.a(abd::a, abd::new);
   public static final aan.b<abd> b = aan.a("debug/village_sections");

   private abd(wa $$0) {
      this($$0.a(HashSet::new, wa::g), $$0.a(HashSet::new, wa::g));
   }

   private void a(wa $$0) {
      $$0.a(this.c, wa::a);
      $$0.a(this.d, wa::a);
   }

   @Override
   public aan.b<abd> a() {
      return b;
   }

   public Set<kg> b() {
      return this.c;
   }

   public Set<kg> c() {
      return this.d;
   }
}
