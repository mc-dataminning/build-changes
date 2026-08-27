import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ekq {
   public final elx a = new elx(ac.g(), TimeUnit.MILLISECONDS, ac.a);
   public final elx.e<List<ejp>> b;
   public final elx.e<List<ejq>> c;
   public final elx.e<ejv> d;
   public final elx.e<Integer> e;
   public final elx.e<Boolean> f;
   public final elx.e<ejo> g;
   public final ekr h = new ekr(new emd());

   public ekq(eiz $$0) {
      this.c = this.a.a("server list", () -> $$0.e().a, Duration.ofSeconds(60L), ely.a);
      this.d = this.a.a("live stats", $$0::g, Duration.ofSeconds(10L), ely.a);
      this.e = this.a.a("pending invite count", $$0::k, Duration.ofSeconds(10L), ely.a(360));
      this.f = this.a.a("trial availablity", $$0::o, Duration.ofSeconds(60L), ely.a(60));
      this.g = this.a.a("unread news", $$0::n, Duration.ofMinutes(5L), ely.a);
      this.b = this.a.a("notifications", $$0::f, Duration.ofMinutes(5L), ely.a);
   }
}
