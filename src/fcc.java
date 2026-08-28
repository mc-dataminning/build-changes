import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fcc {
   public final fdl a = new fdl(ac.h(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fdl.e<?>> h;
   public final fdl.e<List<fbc>> b;
   public final fdl.e<fcc.a> c;
   public final fdl.e<Integer> d;
   public final fdl.e<Boolean> e;
   public final fdl.e<fbb> f;
   public final fcd g = new fcd(new fdr());

   public fcc(fam $$0) {
      this.c = this.a.a("server list", () -> {
         fbf $$1 = $$0.b();
         return fah.b() ? new fcc.a($$1.a, $$0.c()) : new fcc.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fdm.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fdm.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fdm.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fdm.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fdm.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fdl.e<?>> a() {
      return this.h;
   }

   public static record a(List<fbd> a, List<fbd> b) {
   }
}
