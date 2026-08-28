import java.util.HashSet;
import java.util.Set;

public record abi(Set<kb> c, Set<kb> d) implements aat {
   public static final zj<wl, abi> a = aat.a(abi::a, abi::new);
   public static final aat.b<abi> b = aat.a("debug/village_sections");

   private abi(wl $$0) {
      this($$0.a(HashSet::new, wl::g), $$0.a(HashSet::new, wl::g));
   }

   private void a(wl $$0) {
      $$0.a(this.c, wl::a);
      $$0.a(this.d, wl::a);
   }

   @Override
   public aat.b<abi> a() {
      return b;
   }

   public Set<kb> b() {
      return this.c;
   }

   public Set<kb> c() {
      return this.d;
   }
}
