import java.util.HashSet;
import java.util.Set;

public record aao(Set<kk> c, Set<kk> d) implements zy {
   public static final ym<vl, aao> a = zy.a(aao::a, aao::new);
   public static final zy.b<aao> b = zy.a("debug/village_sections");

   private aao(vl $$0) {
      this($$0.a(HashSet::new, vl::g), $$0.a(HashSet::new, vl::g));
   }

   private void a(vl $$0) {
      $$0.a(this.c, vl::a);
      $$0.a(this.d, vl::a);
   }

   @Override
   public zy.b<aao> a() {
      return b;
   }

   public Set<kk> b() {
      return this.c;
   }

   public Set<kk> c() {
      return this.d;
   }
}
