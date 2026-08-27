import java.util.HashSet;
import java.util.Set;

public record aaf(Set<jg> c, Set<jg> d) implements zq {
   public static final yg<vi, aaf> a = zq.a(aaf::a, aaf::new);
   public static final zq.b<aaf> b = zq.a("debug/village_sections");

   private aaf(vi $$0) {
      this($$0.a(HashSet::new, vi::g), $$0.a(HashSet::new, vi::g));
   }

   private void a(vi $$0) {
      $$0.a(this.c, vi::a);
      $$0.a(this.d, vi::a);
   }

   @Override
   public zq.b<aaf> a() {
      return b;
   }

   public Set<jg> b() {
      return this.c;
   }

   public Set<jg> c() {
      return this.d;
   }
}
