import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fgy {
   public final fig a = new fig(ae.h(), TimeUnit.MILLISECONDS, ae.c);
   private final List<fig.e<?>> i;
   public final fig.e<List<fga>> b;
   public final fig.e<fgy.a> c;
   public final fig.e<Integer> d;
   public final fig.e<Boolean> e;
   public final fig.e<ffz> f;
   public final fig.e<fge> g;
   public final fgz h = new fgz(new fim());

   public fgy(ffa $$0) {
      this.c = this.a.a("server list", () -> {
         fgd $$1 = $$0.b();
         return fev.b() ? new fgy.a($$1.a, $$0.c()) : new fgy.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fih.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fih.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fih.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fih.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fih.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fih.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fig.e<?>> a() {
      return this.i;
   }

   public static record a(List<fgb> a, List<fgb> b) {
   }
}
