import java.util.List;
import java.util.Optional;

public record agz(int b, List<String> c, Optional<String> d) implements yw<agf> {
   public static final yn<vl, agz> a = yn.a(yl.h, agz::b, yl.b(1024).a(yl.c(100)), agz::e, yl.b(32).a(yl::a), agz::f, agz::new);

   public agz(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public yy<agz> a() {
      return agd.bC;
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
