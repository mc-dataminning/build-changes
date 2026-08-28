import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcd {
   public final fdm a = new fdm(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdm.e<?>> h;
   public final fdm.e<List<fbd>> b;
   public final fdm.e<fcd.a> c;
   public final fdm.e<Integer> d;
   public final fdm.e<Boolean> e;
   public final fdm.e<fbc> f;
   public final fce g = new fce(new fds());

   public fcd(fan $$0) {
      this.c = this.a.a("server list", () -> {
         fbg $$1 = $$0.b();
         return fai.b() ? new fcd.a($$1.a, $$0.c()) : new fcd.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdn.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdn.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdn.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdn.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdn.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdm.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbe> a, List<fbe> b) {
   }
}
