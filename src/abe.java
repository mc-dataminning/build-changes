import java.util.HashSet;
import java.util.Set;

public record abe(Set<kh> c, Set<kh> d) implements aao {
   public static final zc<wb, abe> a = aao.a(abe::a, abe::new);
   public static final aao.b<abe> b = aao.a("debug/village_sections");

   private abe(wb $$0) {
      this($$0.a(HashSet::new, wb::g), $$0.a(HashSet::new, wb::g));
   }

   private void a(wb $$0) {
      $$0.a(this.c, wb::a);
      $$0.a(this.d, wb::a);
   }

   @Override
   public aao.b<abe> a() {
      return b;
   }

   public Set<kh> b() {
      return this.c;
   }

   public Set<kh> c() {
      return this.d;
   }
}
