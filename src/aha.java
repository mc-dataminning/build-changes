import java.util.List;
import java.util.Optional;

public record aha(int b, List<String> c, Optional<String> d) implements yw<agg> {
   public static final yn<vl, aha> a = yn.a(yl.h, aha::b, yl.b(1024).a(yl.c(100)), aha::e, yl.b(32).a(yl::a), aha::f, aha::new);

   public aha(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public yy<aha> a() {
      return age.bD;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
