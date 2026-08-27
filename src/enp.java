import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class enp {
   public final eoy a = new eoy(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   public final eoy.e<List<emp>> b;
   public final eoy.e<List<emq>> c;
   public final eoy.e<Integer> d;
   public final eoy.e<Boolean> e;
   public final eoy.e<emo> f;
   public final enq g = new enq(new epe());

   public enp(elz $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), eoz.a);
      this.d = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), eoz.a(360));
      this.e = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), eoz.a(60));
      this.f = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), eoz.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), eoz.a);
   }
}
