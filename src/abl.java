import java.util.HashSet;
import java.util.Set;

public record abl(Set<kb> c, Set<kb> d) implements aaw {
   public static final zm<wl, abl> a = aaw.a(abl::a, abl::new);
   public static final aaw.b<abl> b = aaw.a("debug/village_sections");

   private abl(wl $$0) {
      this($$0.a(HashSet::new, wl::g), $$0.a(HashSet::new, wl::g));
   }

   private void a(wl $$0) {
      $$0.a(this.c, wl::a);
      $$0.a(this.d, wl::a);
   }

   @Override
   public aaw.b<abl> a() {
      return b;
   }

   public Set<kb> b() {
      return this.c;
   }

   public Set<kb> c() {
      return this.d;
   }
}
