import java.util.HashSet;
import java.util.Set;

public record aar(Set<kc> c, Set<kc> d) implements aac {
   public static final ys<vr, aar> a = aac.a(aar::a, aar::new);
   public static final aac.b<aar> b = aac.a("debug/village_sections");

   private aar(vr $$0) {
      this($$0.a(HashSet::new, vr::g), $$0.a(HashSet::new, vr::g));
   }

   private void a(vr $$0) {
      $$0.a(this.c, vr::a);
      $$0.a(this.d, vr::a);
   }

   @Override
   public aac.b<aar> a() {
      return b;
   }

   public Set<kc> b() {
      return this.c;
   }

   public Set<kc> c() {
      return this.d;
   }
}
