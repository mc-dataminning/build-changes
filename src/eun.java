import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eun {
   public final evw a = new evw(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<evw.e<?>> h;
   public final evw.e<List<etn>> b;
   public final evw.e<eun.a> c;
   public final evw.e<Integer> d;
   public final evw.e<Boolean> e;
   public final evw.e<etm> f;
   public final euo g = new euo(new ewc());

   public eun(esx $$0) {
      this.c = this.a.a("server list", () -> {
         etq $$1 = $$0.b();
         return ess.b() ? new eun.a($$1.a, $$0.c()) : new eun.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), evx.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), evx.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), evx.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), evx.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), evx.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<evw.e<?>> a() {
      return this.h;
   }

   public static record a(List<eto> a, List<eto> b) {
   }
}
