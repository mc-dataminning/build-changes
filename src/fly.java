import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fly {
   public final fng a = new fng(af.i(), TimeUnit.MILLISECONDS, af.c);
   private final List<fng.e<?>> i;
   public final fng.e<List<fkz>> b;
   public final fng.e<fly.a> c;
   public final fng.e<Integer> d;
   public final fng.e<Boolean> e;
   public final fng.e<fky> f;
   public final fng.e<fld> g;
   public final flz h = new flz(new fnm());

   public fly(fjz $$0) {
      this.c = this.a.a("server list", () -> {
         flc $$1 = $$0.b();
         return fju.b() ? new fly.a($$1.a, $$0.c()) : new fly.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fnh.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fnh.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fnh.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fnh.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fnh.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fnh.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fng.e<?>> a() {
      return this.i;
   }

   public static record a(List<fla> a, List<fla> b) {
   }
}
