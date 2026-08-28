import java.util.HashSet;
import java.util.Set;

public record abl(Set<kj> c, Set<kj> d) implements aav {
   public static final zj<wi, abl> a = aav.a(abl::a, abl::new);
   public static final aav.b<abl> b = aav.a("debug/village_sections");

   private abl(wi $$0) {
      this($$0.a(HashSet::new, wi::g), $$0.a(HashSet::new, wi::g));
   }

   private void a(wi $$0) {
      $$0.a(this.c, wi::a);
      $$0.a(this.d, wi::a);
   }

   @Override
   public aav.b<abl> a() {
      return b;
   }

   public Set<kj> b() {
      return this.c;
   }

   public Set<kj> c() {
      return this.d;
   }
}
