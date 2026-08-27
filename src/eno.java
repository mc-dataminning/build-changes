import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eno {
   public final eow a = new eow(ac.g(), TimeUnit.MILLISECONDS, ac.a);
   public final eow.e<List<emn>> b;
   public final eow.e<List<emo>> c;
   public final eow.e<emt> d;
   public final eow.e<Integer> e;
   public final eow.e<Boolean> f;
   public final eow.e<emm> g;
   public final enp h = new enp(new epc());

   public eno(elx $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), eox.a);
      this.d = this.a.a("live stats", $$0::d, Duration.ofSeconds(10L), eox.a);
      this.e = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), eox.a(360));
      this.f = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), eox.a(60));
      this.g = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), eox.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), eox.a);
   }
}
