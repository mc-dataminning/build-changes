import java.util.List;
import java.util.Optional;

public record ahu(int b, List<String> c, Optional<String> d) implements zo<aha> {
   public static final ze<vy, ahu> a = ze.a(zc.h, ahu::b, zc.b(1024).a(zc.c(100)), ahu::e, zc.b(32).a(zc::a), ahu::f, ahu::new);

   public ahu(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zq<ahu> a() {
      return agy.bD;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
