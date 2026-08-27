import java.util.HashSet;
import java.util.Set;

public record aad(Set<je> c, Set<je> d) implements zo {
   public static final ye<vg, aad> a = zo.a(aad::a, aad::new);
   public static final zo.b<aad> b = zo.a("debug/village_sections");

   private aad(vg $$0) {
      this($$0.a(HashSet::new, vg::g), $$0.a(HashSet::new, vg::g));
   }

   private void a(vg $$0) {
      $$0.a(this.c, vg::a);
      $$0.a(this.d, vg::a);
   }

   @Override
   public zo.b<aad> a() {
      return b;
   }

   public Set<je> b() {
      return this.c;
   }

   public Set<je> c() {
      return this.d;
   }
}
