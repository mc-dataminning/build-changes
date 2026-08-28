import java.util.List;
import java.util.Optional;

public record aig(int b, List<String> c, Optional<String> d) implements aac<ahm> {
   public static final zt<ws, aig> a = zt.a(zr.h, aig::b, zr.b(1024).a(zr.c(100)), aig::e, zr.b(32).a(zr::a), aig::f, aig::new);

   public aig(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public aae<aig> a() {
      return ahk.bD;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
