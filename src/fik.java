import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fik {
   public final fjs a = new fjs(af.i(), TimeUnit.MILLISECONDS, af.c);
   private final List<fjs.e<?>> i;
   public final fjs.e<List<fhl>> b;
   public final fjs.e<fik.a> c;
   public final fjs.e<Integer> d;
   public final fjs.e<Boolean> e;
   public final fjs.e<fhk> f;
   public final fjs.e<fhp> g;
   public final fil h = new fil(new fjy());

   public fik(fgl $$0) {
      this.c = this.a.a("server list", () -> {
         fho $$1 = $$0.b();
         return fgg.b() ? new fik.a($$1.a, $$0.c()) : new fik.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fjt.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fjt.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fjt.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fjt.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fjt.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fjt.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fjs.e<?>> a() {
      return this.i;
   }

   public static record a(List<fhm> a, List<fhm> b) {
   }
}
