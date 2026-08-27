import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class enx {
   public final epg a = new epg(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   public final epg.e<List<emx>> b;
   public final epg.e<List<emy>> c;
   public final epg.e<Integer> d;
   public final epg.e<Boolean> e;
   public final epg.e<emw> f;
   public final eny g = new eny(new epm());

   public enx(emh $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), eph.a);
      this.d = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), eph.a(360));
      this.e = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), eph.a(60));
      this.f = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), eph.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), eph.a);
   }
}
