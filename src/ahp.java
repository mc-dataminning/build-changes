import java.util.List;
import java.util.Optional;

public record ahp(int b, List<String> c, Optional<String> d) implements zp<agv> {
   public static final zg<wf, ahp> a = zg.a(ze.h, ahp::b, ze.b(1024).a(ze.c(100)), ahp::e, ze.b(32).a(ze::a), ahp::f, ahp::new);

   public ahp(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zr<ahp> a() {
      return agt.bz;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
