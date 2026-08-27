import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class evj {
   public final ews a = new ews(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<ews.e<?>> h;
   public final ews.e<List<euj>> b;
   public final ews.e<evj.a> c;
   public final ews.e<Integer> d;
   public final ews.e<Boolean> e;
   public final ews.e<eui> f;
   public final evk g = new evk(new ewy());

   public evj(ett $$0) {
      this.c = this.a.a("server list", () -> {
         eum $$1 = $$0.b();
         return eto.b() ? new evj.a($$1.a, $$0.c()) : new evj.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), ewt.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), ewt.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), ewt.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), ewt.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), ewt.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<ews.e<?>> a() {
      return this.h;
   }

   public static record a(List<euk> a, List<euk> b) {
   }
}
