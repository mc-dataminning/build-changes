import java.util.HashSet;
import java.util.Set;

public record aay(Set<kf> c, Set<kf> d) implements aaj {
   public static final yx<vw, aay> a = aaj.a(aay::a, aay::new);
   public static final aaj.b<aay> b = aaj.a("debug/village_sections");

   private aay(vw $$0) {
      this($$0.a(HashSet::new, vw::g), $$0.a(HashSet::new, vw::g));
   }

   private void a(vw $$0) {
      $$0.a(this.c, vw::a);
      $$0.a(this.d, vw::a);
   }

   @Override
   public aaj.b<aay> a() {
      return b;
   }

   public Set<kf> b() {
      return this.c;
   }

   public Set<kf> c() {
      return this.d;
   }
}
