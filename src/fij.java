import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fij {
   public final fjr a = new fjr(af.h(), TimeUnit.MILLISECONDS, af.c);
   private final List<fjr.e<?>> i;
   public final fjr.e<List<fhk>> b;
   public final fjr.e<fij.a> c;
   public final fjr.e<Integer> d;
   public final fjr.e<Boolean> e;
   public final fjr.e<fhj> f;
   public final fjr.e<fho> g;
   public final fik h = new fik(new fjx());

   public fij(fgk $$0) {
      this.c = this.a.a("server list", () -> {
         fhn $$1 = $$0.b();
         return fgf.b() ? new fij.a($$1.a, $$0.c()) : new fij.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fjs.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fjs.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fjs.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fjs.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fjs.a);
      this.g = this.a.a("online players", $$0::e, Duration.ofSeconds(10L), fjs.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fjr.e<?>> a() {
      return this.i;
   }

   public static record a(List<fhl> a, List<fhl> b) {
   }
}
