import java.util.List;
import java.util.Optional;

public record aho(int b, List<String> c, Optional<String> d) implements zo<agu> {
   public static final zf<we, aho> a = zf.a(zd.h, aho::b, zd.b(1024).a(zd.c(100)), aho::e, zd.b(32).a(zd::a), aho::f, aho::new);

   public aho(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zq<aho> a() {
      return ags.bz;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
