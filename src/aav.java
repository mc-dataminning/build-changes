import java.util.HashSet;
import java.util.Set;

public record aav(Set<kl> c, Set<kl> d) implements aaf {
   public static final yt<vr, aav> a = aaf.a(aav::a, aav::new);
   public static final aaf.b<aav> b = aaf.a("debug/village_sections");

   private aav(vr $$0) {
      this($$0.a(HashSet::new, vr::g), $$0.a(HashSet::new, vr::g));
   }

   private void a(vr $$0) {
      $$0.a(this.c, vr::a);
      $$0.a(this.d, vr::a);
   }

   @Override
   public aaf.b<aav> a() {
      return b;
   }

   public Set<kl> b() {
      return this.c;
   }

   public Set<kl> c() {
      return this.d;
   }
}
