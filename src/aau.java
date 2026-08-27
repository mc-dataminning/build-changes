import java.util.HashSet;
import java.util.Set;

public record aau(Set<jq> c, Set<jq> d) implements aaf {
   public static final yv<vx, aau> a = aaf.a(aau::a, aau::new);
   public static final aaf.b<aau> b = aaf.a("debug/village_sections");

   private aau(vx $$0) {
      this($$0.a(HashSet::new, vx::g), $$0.a(HashSet::new, vx::g));
   }

   private void a(vx $$0) {
      $$0.a(this.c, vx::a);
      $$0.a(this.d, vx::a);
   }

   @Override
   public aaf.b<aau> a() {
      return b;
   }

   public Set<jq> b() {
      return this.c;
   }

   public Set<jq> c() {
      return this.d;
   }
}
