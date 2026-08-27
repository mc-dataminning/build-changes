import java.util.HashSet;
import java.util.Set;

public record aar(Set<jp> c, Set<jp> d) implements aac {
   public static final ys<vu, aar> a = aac.a(aar::a, aar::new);
   public static final aac.b<aar> b = aac.a("debug/village_sections");

   private aar(vu $$0) {
      this($$0.a(HashSet::new, vu::g), $$0.a(HashSet::new, vu::g));
   }

   private void a(vu $$0) {
      $$0.a(this.c, vu::a);
      $$0.a(this.d, vu::a);
   }

   @Override
   public aac.b<aar> a() {
      return b;
   }

   public Set<jp> b() {
      return this.c;
   }

   public Set<jp> c() {
      return this.d;
   }
}
