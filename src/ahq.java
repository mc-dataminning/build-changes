import java.util.List;
import java.util.Optional;

public record ahq(int b, List<String> c, Optional<String> d) implements zq<agw> {
   public static final zh<wg, ahq> a = zh.a(zf.h, ahq::b, zf.b(1024).a(zf.c(100)), ahq::e, zf.b(32).a(zf::a), ahq::f, ahq::new);

   public ahq(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zs<ahq> a() {
      return agu.bz;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
