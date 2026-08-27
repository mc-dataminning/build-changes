import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class esf {
   public final eto a = new eto(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<eto.e<?>> h;
   public final eto.e<List<erf>> b;
   public final eto.e<esf.a> c;
   public final eto.e<Integer> d;
   public final eto.e<Boolean> e;
   public final eto.e<ere> f;
   public final esg g = new esg(new etu());

   public esf(eqp $$0) {
      this.c = this.a.a("server list", () -> {
         eri $$1 = $$0.b();
         return eqk.b() ? new esf.a($$1.a, $$0.c()) : new esf.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), etp.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), etp.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), etp.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), etp.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), etp.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<eto.e<?>> a() {
      return this.h;
   }

   public static record a(List<erg> a, List<erg> b) {
   }
}
