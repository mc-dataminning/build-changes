import java.util.List;
import java.util.Optional;

public record ahn(int b, List<String> c, Optional<String> d) implements zj<agt> {
   public static final za<vy, ahn> a = za.a(yy.h, ahn::b, yy.b(1024).a(yy.c(100)), ahn::e, yy.b(32).a(yy::a), ahn::f, ahn::new);

   public ahn(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zl<ahn> a() {
      return agr.bD;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
