import java.util.HashSet;
import java.util.Set;

public record aba(Set<jy> c, Set<jy> d) implements aak {
   public static final yy<vw, aba> a = aak.a(aba::a, aba::new);
   public static final aak.b<aba> b = aak.a("debug/village_sections");

   private aba(vw $$0) {
      this($$0.a(HashSet::new, vw::g), $$0.a(HashSet::new, vw::g));
   }

   private void a(vw $$0) {
      $$0.a(this.c, vw::a);
      $$0.a(this.d, vw::a);
   }

   @Override
   public aak.b<aba> a() {
      return b;
   }

   public Set<jy> b() {
      return this.c;
   }

   public Set<jy> c() {
      return this.d;
   }
}
