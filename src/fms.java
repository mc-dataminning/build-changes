import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fms {
   public final foa a = new foa(ag.i(), TimeUnit.MILLISECONDS, ag.c);
   private final List<foa.e<?>> i;
   public final foa.e<List<flt>> b;
   public final foa.e<fms.a> c;
   public final foa.e<Integer> d;
   public final foa.e<Boolean> e;
   public final foa.e<fls> f;
   public final foa.e<flx> g;
   public final fmt h = new fmt(new fog());

   public fms(fkt $$0) {
      this.c = this.a.a("server list", () -> {
         flw $$1 = $$0.b();
         return fko.b() ? new fms.a($$1.a, $$0.c()) : new fms.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fob.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fob.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fob.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fob.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fob.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fob.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<foa.e<?>> a() {
      return this.i;
   }

   public static record a(List<flu> a, List<flu> b) {
   }
}
