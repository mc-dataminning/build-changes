import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fjg {
   public final fko a = new fko(af.i(), TimeUnit.MILLISECONDS, af.c);
   private final List<fko.e<?>> i;
   public final fko.e<List<fih>> b;
   public final fko.e<fjg.a> c;
   public final fko.e<Integer> d;
   public final fko.e<Boolean> e;
   public final fko.e<fig> f;
   public final fko.e<fil> g;
   public final fjh h = new fjh(new fku());

   public fjg(fhh $$0) {
      this.c = this.a.a("server list", () -> {
         fik $$1 = $$0.b();
         return fhc.b() ? new fjg.a($$1.a, $$0.c()) : new fjg.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fkp.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fkp.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fkp.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fkp.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fkp.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fkp.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fko.e<?>> a() {
      return this.i;
   }

   public static record a(List<fii> a, List<fii> b) {
   }
}
