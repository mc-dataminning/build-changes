import java.util.List;
import java.util.Optional;

public record ahg(int b, List<String> c, Optional<String> d) implements zc<agm> {
   public static final yt<vr, ahg> a = yt.a(yr.h, ahg::b, yr.b(1024).a(yr.c(100)), ahg::e, yr.b(32).a(yr::a), ahg::f, ahg::new);

   public ahg(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public ze<ahg> a() {
      return agk.bD;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
