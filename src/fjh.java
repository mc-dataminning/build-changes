import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fjh {
   public final fkp a = new fkp(ae.h(), TimeUnit.MILLISECONDS, ae.c);
   private final List<fkp.e<?>> i;
   public final fkp.e<List<fii>> b;
   public final fkp.e<fjh.a> c;
   public final fkp.e<Integer> d;
   public final fkp.e<Boolean> e;
   public final fkp.e<fih> f;
   public final fkp.e<fim> g;
   public final fji h = new fji(new fkv());

   public fjh(fhi $$0) {
      this.c = this.a.a("server list", () -> {
         fil $$1 = $$0.b();
         return fhd.b() ? new fjh.a($$1.a, $$0.c()) : new fjh.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fkq.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fkq.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fkq.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fkq.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fkq.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fkq.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fkp.e<?>> a() {
      return this.i;
   }

   public static record a(List<fij> a, List<fij> b) {
   }
}
