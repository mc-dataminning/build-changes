import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fjf {
   public final fkn a = new fkn(ae.h(), TimeUnit.MILLISECONDS, ae.c);
   private final List<fkn.e<?>> i;
   public final fkn.e<List<fig>> b;
   public final fkn.e<fjf.a> c;
   public final fkn.e<Integer> d;
   public final fkn.e<Boolean> e;
   public final fkn.e<fif> f;
   public final fkn.e<fik> g;
   public final fjg h = new fjg(new fkt());

   public fjf(fhg $$0) {
      this.c = this.a.a("server list", () -> {
         fij $$1 = $$0.b();
         return fhb.b() ? new fjf.a($$1.a, $$0.c()) : new fjf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fko.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fko.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fko.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fko.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fko.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fko.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fkn.e<?>> a() {
      return this.i;
   }

   public static record a(List<fih> a, List<fih> b) {
   }
}
