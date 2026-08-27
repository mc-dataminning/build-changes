import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fad {
   public final fbm a = new fbm(ac.g(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fbm.e<?>> h;
   public final fbm.e<List<ezd>> b;
   public final fbm.e<fad.a> c;
   public final fbm.e<Integer> d;
   public final fbm.e<Boolean> e;
   public final fbm.e<ezc> f;
   public final fae g = new fae(new fbs());

   public fad(eyn $$0) {
      this.c = this.a.a("server list", () -> {
         ezg $$1 = $$0.b();
         return eyi.b() ? new fad.a($$1.a, $$0.c()) : new fad.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fbn.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fbn.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fbn.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fbn.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fbn.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fbm.e<?>> a() {
      return this.h;
   }

   public static record a(List<eze> a, List<eze> b) {
   }
}
