import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class enq {
   public final eoz a = new eoz(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   public final eoz.e<List<emq>> b;
   public final eoz.e<List<emr>> c;
   public final eoz.e<emw> d;
   public final eoz.e<Integer> e;
   public final eoz.e<Boolean> f;
   public final eoz.e<emp> g;
   public final enr h = new enr(new epf());

   public enq(ema $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), epa.a);
      this.d = this.a.a("live stats", $$0::d, Duration.ofSeconds(10L), epa.a);
      this.e = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), epa.a(360));
      this.f = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), epa.a(60));
      this.g = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), epa.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), epa.a);
   }
}
