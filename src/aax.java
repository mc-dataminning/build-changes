import java.util.HashSet;
import java.util.Set;

public record aax(Set<kf> c, Set<kf> d) implements aai {
   public static final yw<vv, aax> a = aai.a(aax::a, aax::new);
   public static final aai.b<aax> b = aai.a("debug/village_sections");

   private aax(vv $$0) {
      this($$0.a(HashSet::new, vv::g), $$0.a(HashSet::new, vv::g));
   }

   private void a(vv $$0) {
      $$0.a(this.c, vv::a);
      $$0.a(this.d, vv::a);
   }

   @Override
   public aai.b<aax> a() {
      return b;
   }

   public Set<kf> b() {
      return this.c;
   }

   public Set<kf> c() {
      return this.d;
   }
}
