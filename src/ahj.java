import java.util.List;
import java.util.Optional;

public record ahj(int b, List<String> c, Optional<String> d) implements zf<agp> {
   public static final yw<vu, ahj> a = yw.a(yu.h, ahj::b, yu.b(1024).a(yu.c(100)), ahj::e, yu.b(32).a(yu::a), ahj::f, ahj::new);

   public ahj(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zh<ahj> a() {
      return agn.bD;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
