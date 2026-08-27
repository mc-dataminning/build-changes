import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class env {
   public final epe a = new epe(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   public final epe.e<List<emv>> b;
   public final epe.e<List<emw>> c;
   public final epe.e<enb> d;
   public final epe.e<Integer> e;
   public final epe.e<Boolean> f;
   public final epe.e<emu> g;
   public final enw h = new enw(new epk());

   public env(emf $$0) {
      this.c = this.a.a("server list", () -> $$0.b().a, Duration.ofSeconds(60L), epf.a);
      this.d = this.a.a("live stats", $$0::d, Duration.ofSeconds(10L), epf.a);
      this.e = this.a.a("pending invite count", $$0::g, Duration.ofSeconds(10L), epf.a(360));
      this.f = this.a.a("trial availablity", $$0::k, Duration.ofSeconds(60L), epf.a(60));
      this.g = this.a.a("unread news", $$0::j, Duration.ofMinutes(5L), epf.a);
      this.b = this.a.a("notifications", $$0::c, Duration.ofMinutes(5L), epf.a);
   }
}
