import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fkd {
   public final fll a = new fll(af.i(), TimeUnit.MILLISECONDS, af.c);
   private final List<fll.e<?>> i;
   public final fll.e<List<fje>> b;
   public final fll.e<fkd.a> c;
   public final fll.e<Integer> d;
   public final fll.e<Boolean> e;
   public final fll.e<fjd> f;
   public final fll.e<fji> g;
   public final fke h = new fke(new flr());

   public fkd(fie $$0) {
      this.c = this.a.a("server list", () -> {
         fjh $$1 = $$0.b();
         return fhz.b() ? new fkd.a($$1.a, $$0.c()) : new fkd.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), flm.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), flm.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), flm.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), flm.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), flm.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), flm.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fll.e<?>> a() {
      return this.i;
   }

   public static record a(List<fjf> a, List<fjf> b) {
   }
}
