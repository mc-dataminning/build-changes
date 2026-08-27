import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ewh {
   public final exq a = new exq(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<exq.e<?>> h;
   public final exq.e<List<evh>> b;
   public final exq.e<ewh.a> c;
   public final exq.e<Integer> d;
   public final exq.e<Boolean> e;
   public final exq.e<evg> f;
   public final ewi g = new ewi(new exw());

   public ewh(eur $$0) {
      this.c = this.a.a("server list", () -> {
         evk $$1 = $$0.b();
         return eum.b() ? new ewh.a($$1.a, $$0.c()) : new ewh.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), exr.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), exr.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), exr.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), exr.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), exr.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<exq.e<?>> a() {
      return this.h;
   }

   public static record a(List<evi> a, List<evi> b) {
   }
}
