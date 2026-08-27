import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ezt {
   public final fbc a = new fbc(ac.g(), TimeUnit.MILLISECONDS, ac.c);
   private final List<fbc.e<?>> h;
   public final fbc.e<List<eyt>> b;
   public final fbc.e<ezt.a> c;
   public final fbc.e<Integer> d;
   public final fbc.e<Boolean> e;
   public final fbc.e<eys> f;
   public final ezu g = new ezu(new fbi());

   public ezt(eyd $$0) {
      this.c = this.a.a("server list", () -> {
         eyw $$1 = $$0.b();
         return exy.b() ? new ezt.a($$1.a, $$0.c()) : new ezt.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fbd.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), fbd.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), fbd.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), fbd.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), fbd.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<fbc.e<?>> a() {
      return this.h;
   }

   public static record a(List<eyu> a, List<eyu> b) {
   }
}
