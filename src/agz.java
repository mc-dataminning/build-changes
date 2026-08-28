import java.util.List;
import java.util.Optional;

public record agz(int b, List<String> c, Optional<String> d) implements yv<agf> {
   public static final ym<vl, agz> a = ym.a(yk.h, agz::b, yk.b(1024).a(yk.c(100)), agz::e, yk.b(32).a(yk::a), agz::f, agz::new);

   public agz(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public yx<agz> a() {
      return agd.bD;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
