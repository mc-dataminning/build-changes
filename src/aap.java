import java.util.HashSet;
import java.util.Set;

public record aap(Set<kk> c, Set<kk> d) implements zz {
   public static final yn<vl, aap> a = zz.a(aap::a, aap::new);
   public static final zz.b<aap> b = zz.a("debug/village_sections");

   private aap(vl $$0) {
      this($$0.a(HashSet::new, vl::g), $$0.a(HashSet::new, vl::g));
   }

   private void a(vl $$0) {
      $$0.a(this.c, vl::a);
      $$0.a(this.d, vl::a);
   }

   @Override
   public zz.b<aap> a() {
      return b;
   }

   public Set<kk> b() {
      return this.c;
   }

   public Set<kk> c() {
      return this.d;
   }
}
