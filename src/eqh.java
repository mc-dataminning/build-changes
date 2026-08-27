import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eqh {
   public final erq a = new erq(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<erq.e<?>> h;
   public final erq.e<List<eph>> b;
   public final erq.e<eqh.a> c;
   public final erq.e<Integer> d;
   public final erq.e<Boolean> e;
   public final erq.e<epg> f;
   public final eqi g = new eqi(new erw());

   public eqh(eor $$0) {
      this.c = this.a.a("server list", () -> {
         epk $$1 = $$0.b();
         return eom.b() ? new eqh.a($$1.a, $$0.c()) : new eqh.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), err.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), err.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), err.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), err.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), err.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<erq.e<?>> a() {
      return this.h;
   }

   public static record a(List<epi> a, List<epi> b) {
   }
}
