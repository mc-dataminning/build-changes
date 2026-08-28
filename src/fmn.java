import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fmn {
   public final fnv a = new fnv(ag.i(), TimeUnit.MILLISECONDS, ag.c);
   private final List<fnv.e<?>> i;
   public final fnv.e<List<flo>> b;
   public final fnv.e<fmn.a> c;
   public final fnv.e<Integer> d;
   public final fnv.e<Boolean> e;
   public final fnv.e<fln> f;
   public final fnv.e<fls> g;
   public final fmo h = new fmo(new fob());

   public fmn(fko $$0) {
      this.c = this.a.a("server list", () -> {
         flr $$1 = $$0.b();
         return fkj.b() ? new fmn.a($$1.a, $$0.c()) : new fmn.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fnw.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fnw.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fnw.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fnw.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fnw.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fnw.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fnv.e<?>> a() {
      return this.i;
   }

   public static record a(List<flp> a, List<flp> b) {
   }
}
