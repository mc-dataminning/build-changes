import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fih {
   public final fjp a = new fjp(af.h(), TimeUnit.MILLISECONDS, af.c);
   private final List<fjp.e<?>> i;
   public final fjp.e<List<fhi>> b;
   public final fjp.e<fih.a> c;
   public final fjp.e<Integer> d;
   public final fjp.e<Boolean> e;
   public final fjp.e<fhh> f;
   public final fjp.e<fhm> g;
   public final fii h = new fii(new fjv());

   public fih(fgi $$0) {
      this.c = this.a.a("server list", () -> {
         fhl $$1 = $$0.b();
         return fgd.b() ? new fih.a($$1.a, $$0.c()) : new fih.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fjq.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fjq.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fjq.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fjq.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fjq.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fjq.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fjp.e<?>> a() {
      return this.i;
   }

   public static record a(List<fhj> a, List<fhj> b) {
   }
}
