import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class enn {
   public final eov a = new eov(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   public final eov.e<List<emm>> b;
   public final eov.e<List<emn>> c;
   public final eov.e<ems> d;
   public final eov.e<Integer> e;
   public final eov.e<Boolean> f;
   public final eov.e<eml> g;
   public final eno h = new eno(new epb());

   public enn(elw $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), eow.a);
      this.d = this.a.a("live stats", $$0::d, Duration.ofSeconds(10L), eow.a);
      this.e = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), eow.a(360));
      this.f = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), eow.a(60));
      this.g = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), eow.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), eow.a);
   }
}
