import java.util.List;
import java.util.Optional;

public record ahh(int b, List<String> c, Optional<String> d) implements zd<agn> {
   public static final yu<vs, ahh> a = yu.a(ys.h, ahh::b, ys.b(1024).a(ys.c(100)), ahh::e, ys.b(32).a(ys::a), ahh::f, ahh::new);

   public ahh(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zf<ahh> a() {
      return agl.bD;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
