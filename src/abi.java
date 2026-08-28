import java.util.HashSet;
import java.util.Set;

public record abi(Set<kj> c, Set<kj> d) implements aas {
   public static final zg<wf, abi> a = aas.a(abi::a, abi::new);
   public static final aas.b<abi> b = aas.a("debug/village_sections");

   private abi(wf $$0) {
      this($$0.a(HashSet::new, wf::g), $$0.a(HashSet::new, wf::g));
   }

   private void a(wf $$0) {
      $$0.a(this.c, wf::a);
      $$0.a(this.d, wf::a);
   }

   @Override
   public aas.b<abi> a() {
      return b;
   }

   public Set<kj> b() {
      return this.c;
   }

   public Set<kj> c() {
      return this.d;
   }
}
