import java.util.HashSet;
import java.util.Set;

public record abk(Set<kj> c, Set<kj> d) implements aau {
   public static final zi<wh, abk> a = aau.a(abk::a, abk::new);
   public static final aau.b<abk> b = aau.a("debug/village_sections");

   private abk(wh $$0) {
      this($$0.a(HashSet::new, wh::g), $$0.a(HashSet::new, wh::g));
   }

   private void a(wh $$0) {
      $$0.a(this.c, wh::a);
      $$0.a(this.d, wh::a);
   }

   @Override
   public aau.b<abk> a() {
      return b;
   }

   public Set<kj> b() {
      return this.c;
   }

   public Set<kj> c() {
      return this.d;
   }
}
