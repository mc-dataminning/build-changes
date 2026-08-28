import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class foc {
   public final fpl a = new fpl(ag.i(), TimeUnit.MILLISECONDS, ag.c);
   private final List<fpl.e<?>> i;
   public final fpl.e<List<fnd>> b;
   public final fpl.e<foc.a> c;
   public final fpl.e<Integer> d;
   public final fpl.e<Boolean> e;
   public final fpl.e<fnc> f;
   public final fpl.e<fnh> g;
   public final fod h = new fod(new fpr());

   public foc(fmd $$0) {
      this.c = this.a.a("server list", () -> {
         fng $$1 = $$0.c();
         return fly.b() ? new foc.a($$1.a, $$0.d()) : new foc.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fpm.a);
      this.d = this.a.a("pending invite count", $$0::i, Duration.ofSeconds(10L), fpm.a(360));
      this.e = this.a.a("trial availablity", $$0::m, Duration.ofSeconds(60L), fpm.a(60));
      this.f = this.a.a("unread news", $$0::l, Duration.ofMinutes(5L), fpm.a);
      this.b = this.a.a("notifications", $$0::e, Duration.ofMinutes(5L), fpm.a);
      this.g = this.a.a("online players", $$0::f, Duration.ofSeconds(10L), fpm.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fpl.e<?>> a() {
      return this.i;
   }

   public static record a(List<fne> a, List<fne> b) {
   }
}
