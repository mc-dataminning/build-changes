import java.util.HashSet;
import java.util.Set;

public record aay(Set<jx> c, Set<jx> d) implements aai {
   public static final yw<vu, aay> a = aai.a(aay::a, aay::new);
   public static final aai.b<aay> b = aai.a("debug/village_sections");

   private aay(vu $$0) {
      this($$0.a(HashSet::new, vu::g), $$0.a(HashSet::new, vu::g));
   }

   private void a(vu $$0) {
      $$0.a(this.c, vu::a);
      $$0.a(this.d, vu::a);
   }

   @Override
   public aai.b<aay> a() {
      return b;
   }

   public Set<jx> b() {
      return this.c;
   }

   public Set<jx> c() {
      return this.d;
   }
}
