import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ffx {
   public final fhg a = new fhg(ad.h(), TimeUnit.MILLISECONDS, ad.c);
   private final List<fhg.e<?>> i;
   public final fhg.e<List<fez>> b;
   public final fhg.e<ffx.a> c;
   public final fhg.e<Integer> d;
   public final fhg.e<Boolean> e;
   public final fhg.e<fey> f;
   public final fhg.e<ffd> g;
   public final ffy h = new ffy(new fhm());

   public ffx(fej $$0) {
      this.c = this.a.a("server list", () -> {
         ffc $$1 = $$0.b();
         return fee.b() ? new ffx.a($$1.a, $$0.c()) : new ffx.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fhh.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fhh.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fhh.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fhh.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fhh.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fhh.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fhg.e<?>> a() {
      return this.i;
   }

   public static record a(List<ffa> a, List<ffa> b) {
   }
}
