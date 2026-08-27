import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class enm {
   public final eou a = new eou(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   public final eou.e<List<eml>> b;
   public final eou.e<List<emm>> c;
   public final eou.e<emr> d;
   public final eou.e<Integer> e;
   public final eou.e<Boolean> f;
   public final eou.e<emk> g;
   public final enn h = new enn(new epa());

   public enm(elv $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), eov.a);
      this.d = this.a.a("live stats", $$0::d, Duration.ofSeconds(10L), eov.a);
      this.e = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), eov.a(360));
      this.f = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), eov.a(60));
      this.g = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), eov.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), eov.a);
   }
}
