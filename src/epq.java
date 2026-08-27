import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class epq {
   public final eqz a = new eqz(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<eqz.e<?>> h;
   public final eqz.e<List<eoq>> b;
   public final eqz.e<epq.a> c;
   public final eqz.e<Integer> d;
   public final eqz.e<Boolean> e;
   public final eqz.e<eop> f;
   public final epr g = new epr(new erf());

   public epq(eoa $$0) {
      this.c = this.a.a("server list", () -> {
         eot $$1 = $$0.b();
         return env.b() ? new epq.a($$1.a, $$0.c()) : new epq.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), era.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), era.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), era.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), era.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), era.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<eqz.e<?>> a() {
      return this.h;
   }

   public static record a(List<eor> a, List<eor> b) {
   }
}
