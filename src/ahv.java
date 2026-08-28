import java.util.List;
import java.util.Optional;

public record ahv(int b, List<String> c, Optional<String> d) implements zr<ahb> {
   public static final zi<wh, ahv> a = zi.a(zg.h, ahv::b, zg.b(1024).a(zg.c(100)), ahv::e, zg.b(32).a(zg::a), ahv::f, ahv::new);

   public ahv(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zt<ahv> a() {
      return agz.bD;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
