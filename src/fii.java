import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fii {
   public final fjq a = new fjq(af.h(), TimeUnit.MILLISECONDS, af.c);
   private final List<fjq.e<?>> i;
   public final fjq.e<List<fhj>> b;
   public final fjq.e<fii.a> c;
   public final fjq.e<Integer> d;
   public final fjq.e<Boolean> e;
   public final fjq.e<fhi> f;
   public final fjq.e<fhn> g;
   public final fij h = new fij(new fjw());

   public fii(fgj $$0) {
      this.c = this.a.a("server list", () -> {
         fhm $$1 = $$0.b();
         return fge.b() ? new fii.a($$1.a, $$0.c()) : new fii.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fjr.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fjr.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fjr.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fjr.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fjr.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fjr.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fjq.e<?>> a() {
      return this.i;
   }

   public static record a(List<fhk> a, List<fhk> b) {
   }
}
