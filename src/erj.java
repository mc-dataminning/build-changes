import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class erj {
   public final ess a = new ess(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<ess.e<?>> h;
   public final ess.e<List<eqj>> b;
   public final ess.e<erj.a> c;
   public final ess.e<Integer> d;
   public final ess.e<Boolean> e;
   public final ess.e<eqi> f;
   public final erk g = new erk(new esy());

   public erj(ept $$0) {
      this.c = this.a.a("server list", () -> {
         eqm $$1 = $$0.b();
         return epo.b() ? new erj.a($$1.a, $$0.c()) : new erj.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), est.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), est.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), est.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), est.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), est.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<ess.e<?>> a() {
      return this.h;
   }

   public static record a(List<eqk> a, List<eqk> b) {
   }
}
