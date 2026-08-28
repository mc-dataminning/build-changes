import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fnp {
   public final foy a = new foy(ag.i(), TimeUnit.MILLISECONDS, ag.c);
   private final List<foy.e<?>> i;
   public final foy.e<List<fmq>> b;
   public final foy.e<fnp.a> c;
   public final foy.e<Integer> d;
   public final foy.e<Boolean> e;
   public final foy.e<fmp> f;
   public final foy.e<fmu> g;
   public final fnq h = new fnq(new fpe());

   public fnp(flq $$0) {
      this.c = this.a.a("server list", () -> {
         fmt $$1 = $$0.c();
         return fll.b() ? new fnp.a($$1.a, $$0.d()) : new fnp.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), foz.a);
      this.d = this.a.a("pending invite count", $$0::i, Duration.ofSeconds(10L), foz.a(360));
      this.e = this.a.a("trial availablity", $$0::m, Duration.ofSeconds(60L), foz.a(60));
      this.f = this.a.a("unread news", $$0::l, Duration.ofMinutes(5L), foz.a);
      this.b = this.a.a("notifications", $$0::e, Duration.ofMinutes(5L), foz.a);
      this.g = this.a.a("online players", $$0::f, Duration.ofSeconds(10L), foz.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<foy.e<?>> a() {
      return this.i;
   }

   public static record a(List<fmr> a, List<fmr> b) {
   }
}
