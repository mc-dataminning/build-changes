import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eon {
   public final epw a = new epw(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<epw.e<?>> h;
   public final epw.e<List<enn>> b;
   public final epw.e<eon.a> c;
   public final epw.e<Integer> d;
   public final epw.e<Boolean> e;
   public final epw.e<enm> f;
   public final eoo g = new eoo(new eqc());

   public eon(emx $$0) {
      this.c = this.a.a("server list", () -> {
         enq $$1 = $$0.b();
         return ems.b() ? new eon.a($$1.a, $$0.c()) : new eon.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), epx.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), epx.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), epx.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), epx.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), epx.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<epw.e<?>> a() {
      return this.h;
   }

   public static record a(List<eno> a, List<eno> b) {
   }
}
