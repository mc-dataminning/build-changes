import java.util.HashSet;
import java.util.Set;

public record aap(Set<jo> c, Set<jo> d) implements aaa {
   public static final yq<vs, aap> a = aaa.a(aap::a, aap::new);
   public static final aaa.b<aap> b = aaa.a("debug/village_sections");

   private aap(vs $$0) {
      this($$0.a(HashSet::new, vs::g), $$0.a(HashSet::new, vs::g));
   }

   private void a(vs $$0) {
      $$0.a(this.c, vs::a);
      $$0.a(this.d, vs::a);
   }

   @Override
   public aaa.b<aap> a() {
      return b;
   }

   public Set<jo> b() {
      return this.c;
   }

   public Set<jo> c() {
      return this.d;
   }
}
