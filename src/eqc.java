import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class eqc {
   public final erl a = new erl(ac.g(), TimeUnit.MILLISECONDS, ac.b);
   private final List<erl.e<?>> h;
   public final erl.e<List<epc>> b;
   public final erl.e<eqc.a> c;
   public final erl.e<Integer> d;
   public final erl.e<Boolean> e;
   public final erl.e<epb> f;
   public final eqd g = new eqd(new err());

   public eqc(eom $$0) {
      this.c = this.a.a("server list", () -> {
         epf $$1 = $$0.b();
         return eoh.b() ? new eqc.a($$1.a, $$0.c()) : new eqc.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), erm.a);
      this.d = this.a.a("pending invite count", $$0::h, Duration.ofSeconds(10L), erm.a(360));
      this.e = this.a.a("trial availablity", $$0::l, Duration.ofSeconds(60L), erm.a(60));
      this.f = this.a.a("unread news", $$0::k, Duration.ofMinutes(5L), erm.a);
      this.b = this.a.a("notifications", $$0::d, Duration.ofMinutes(5L), erm.a);
      this.h = List.of(this.b, this.c, this.d, this.e, this.f);
   }

   public List<erl.e<?>> a() {
      return this.h;
   }

   public static record a(List<epd> a, List<epd> b) {
   }
}
