import java.util.List;
import java.util.Optional;

public record ahl(int b, List<String> c, Optional<String> d) implements zh<agr> {
   public static final yy<vw, ahl> a = yy.a(yw.h, ahl::b, yw.b(1024).a(yw.c(100)), ahl::e, yw.b(32).a(yw::a), ahl::f, ahl::new);

   public ahl(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zj<ahl> a() {
      return agp.bD;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
