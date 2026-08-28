import java.util.List;
import java.util.Optional;

public record ahl(int b, List<String> c, Optional<String> d) implements zl<agr> {
   public static final zc<wb, ahl> a = zc.a(za.h, ahl::b, za.b(1024).a(za.c(100)), ahl::e, za.b(32).a(za::a), ahl::f, ahl::new);

   public ahl(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zn<ahl> a() {
      return agp.bz;
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
