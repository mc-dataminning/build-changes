import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class esg {
   public final etp a = new etp(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<etp.e<?>> h;
   public final etp.e<List<erg>> b;
   public final etp.e<esg.a> c;
   public final etp.e<Integer> d;
   public final etp.e<Boolean> e;
   public final etp.e<erf> f;
   public final esh g = new esh(new etv());

   public esg(eqq $$0) {
      this.c = this.a.a("server list", () -> {
         erj $$1 = $$0.b();
         return eql.b() ? new esg.a($$1.a, $$0.c()) : new esg.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), etq.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), etq.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), etq.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), etq.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), etq.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<etp.e<?>> a() {
      return this.h;
   }

   public static record a(List<erh> a, List<erh> b) {
   }
}
